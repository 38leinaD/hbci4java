/**********************************************************************
 *
 * Copyright (c) 2019 Olaf Willuhn
 * All rights reserved.
 * 
 * This software is copyrighted work licensed under the terms of the
 * Jameica License.  Please consult the file "LICENSE" for details. 
 *
 **********************************************************************/

package org.kapott.hbci.tools;

/**
 * Verschiedene String-Hilfsklassen.
 */
public class StringUtil
{
    /**
     * Liefert zu einem HBCI-Code vom Client den zugehoerigen HBCI-Code des Instituts.
     * @param hbciCode der HBCI-Code des Clients.
     * @return der HBCI-Code des Instituts.
     */
    public static String toInsCode(String hbciCode)
    {
        if (hbciCode == null || hbciCode.length() < 3)
            return hbciCode;
        return new StringBuffer(hbciCode).replace(1,2,"I").toString();
    }

    /**
     * Liefert zu einem HBCI-Code vom Client den zugehoerigen HBCI-Code der BPD/UPD.
     * @param hbciCode der HBCI-Code des Clients.
     * @return der HBCI-Code der BPD/UPD.
     */
    public static String toParameterCode(String hbciCode)
    {
        if (hbciCode == null)
            return hbciCode;
        
        return toInsCode(hbciCode) + "S";
    }
}


