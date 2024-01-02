package org.org.example;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;
public class write_to_word {

    public void word(String context) {

        XWPFDocument document = new XWPFDocument();

        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();

        run.setText(context);
        run.setFontFamily("Times New Roman");
        run.setFontSize(20);
        try (FileOutputStream out = new FileOutputStream("CreatedWordDocument.docx")) {
            document.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
