package sample;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.IOException;

public class Controller {

    public void testPDFBox() {
        PDDocument doc = new PDDocument();

        try {
            doc.save("fileName");
            doc.close();
        } catch (IOException ioe) {
            System.out.print(ioe.getMessage());
        }
    }
}
