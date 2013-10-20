package org.kapott.hbci.GV.parsers;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Properties;
import javax.xml.bind.JAXB;
import javax.xml.datatype.XMLGregorianCalendar;

import org.kapott.hbci.sepa.jaxb.pain_001_001_02.CreditTransferTransactionInformation2;
import org.kapott.hbci.sepa.jaxb.pain_001_001_02.Document;
import org.kapott.hbci.sepa.jaxb.pain_001_001_02.PaymentInstructionInformation4;


public class ParsePain00100102 implements ISEPAParser {
    
    public void parse(InputStream xml, ArrayList<Properties> sepaResults) {
        
        Document doc = JAXB.unmarshal(xml, Document.class);
                
        //Payment Information 
        PaymentInstructionInformation4 pmtInf = doc.getPain00100102().getPmtInf();
        
        //Payment Information - Credit Transfer Transaction Information
        ArrayList<CreditTransferTransactionInformation2> cdtTrxTxInfs = (ArrayList<CreditTransferTransactionInformation2>)pmtInf.getCdtTrfTxInf();
            
        for(CreditTransferTransactionInformation2 cdtTrxTxInf : cdtTrxTxInfs) {
            Properties sepaResult = new Properties();

            sepaResult.setProperty("src.name", doc.getPain00100102().getGrpHdr().getInitgPty().getNm());            
            sepaResult.setProperty("src.iban", pmtInf.getDbtrAcct().getId().getIBAN());
            sepaResult.setProperty("src.bic", pmtInf.getDbtrAgt().getFinInstnId().getBIC());
            
            sepaResult.setProperty("dst.name", cdtTrxTxInf.getCdtr().getNm());
            sepaResult.setProperty("dst.iban", cdtTrxTxInf.getCdtrAcct().getId().getIBAN());
            sepaResult.setProperty("dst.bic", cdtTrxTxInf.getCdtrAgt().getFinInstnId().getBIC());
            
            BigDecimal value = cdtTrxTxInf.getAmt().getInstdAmt().getValue();
            sepaResult.setProperty("value", value.toString());
            sepaResult.setProperty("curr", "EUR");
            sepaResult.setProperty("usage", cdtTrxTxInf.getRmtInf().getUstrd());
            
            XMLGregorianCalendar date = pmtInf.getReqdExctnDt();
            sepaResult.setProperty("date", date.toString());
           
            sepaResults.add(sepaResult);
        }
    }
}
