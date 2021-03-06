/**********************************************************************
 *
 * This file is part of HBCI4Java.
 * Copyright (c) 2001-2008 Stefan Palme
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 **********************************************************************/

package org.kapott.hbci.GV_Result;

import java.util.ArrayList;
import java.util.List;

/** Wurden mit dem Job "Bestellen von Kreditinstitutsinformationen" auch Freitextinformationen
    angefordert, so werden diese nicht per Post zugestellt. Statt dessen können diese
    Informationen mit Hilfe dieser Klasse direkt ausgewertet werden. Es wird eine Liste aller
    empfangenen Freitextmeldungen gespeichert. */
public final class GVRInfoOrder
    extends HBCIJobResultImpl
{
    /** Eine einzelne Freitextmeldung */
    public static final class Info
    {
        /** ID-Code der Meldung */
        public String code;
        /** Meldungstext */
        public String msg;

        public String toString()
        {
            return code+": "+msg;
        }
    }

    private List<Info> infos;

    public GVRInfoOrder()
    {
        infos=new ArrayList<Info>();
    }

    public void addEntry(Info info)
    {
        infos.add(info);
    }
    
    /** Gibt alle Freitextmeldungen zurück, die bei der Abfrage von Kreditinstitutsinformationen
        gefunden wurden
        @return Array mit Meldungen */
    public Info[] getEntries()
    {
        return infos.toArray(new Info[infos.size()]);
    }

    public String toString()
    {
        StringBuffer ret=new StringBuffer();

        for (int i=0;i<infos.size();i++) {
            ret.append(infos.get(i).toString()).append(System.getProperty("line.separator"));
        }
        
        return ret.toString().trim();
    }
}
