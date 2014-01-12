package org.kapott.hbci.passport.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Eine Erweiterung von {@link FileOutputStream}.
 *
 * <p>Anstatt mit der eigentlich �bergebenen Zieldatei initialisiert diese Implementierung den Stream aber mit einer tempor�ren Datei.
 * Alle Schreiboperationen auf dem Stream werden also auf diese tempor�re Datei angewendet.</p>
 *
 * <p>Erst wenn der Stream geschlossen wird, wird die tempor�re Datei in die gew�nschte Zieldatei umbenannt. Sollte die Zieldatei bereits
 * existieren, so wird sie erst in diesem Moment ersetzt.</p>
 *
 * <p>Dadurch l�sst sich insbesondere in Fehlerf�llen verhindern, dass die Zieldatei in einem unvollst�ndigen Zustand verbleibt.</p> 
 *
 * @author Hendrik Schnepel
 */
public class TemporaryFileOutputStream extends FileOutputStream {
    
    /**
     * Erzeugt einen neuen {@link TemporaryFileOutputStream} f�r die Zieldatei.
     */
    public static FileOutputStream create(File file) throws IOException {
        return new TemporaryFileOutputStream(getTemporaryFile(file), file);
    }
    
    private static File getTemporaryFile(File file) throws IOException {
        File directory = file.getAbsoluteFile().getParentFile();
        String prefix = file.getName() + "_";
        return File.createTempFile(prefix, "", directory);
    }

    private final File temporaryFile;
    private final File destinationFile;

    private TemporaryFileOutputStream(File temporaryFile, File destinationFile) throws IOException {
        super(temporaryFile);
        this.temporaryFile = temporaryFile;
        this.destinationFile = destinationFile;
    }

    @Override
    public void close() throws IOException {
        super.close();
        /*
         * Sobald der Stream geschlossen ist, wird die (evtl. bestehende) Zieldatei vorsichtshalber gel�scht.
         * Danach wird die tempor�re Datei, die die jetzt neuen Daten enth�lt, in die Zieldatei umbenannt.
         */
        destinationFile.delete();
        temporaryFile.renameTo(destinationFile);
    }

}
