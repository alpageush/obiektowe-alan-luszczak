
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alpageush
 */
public class SaveToFile {
    public void saveToFile(String text) {
        System.out.print(text);
        try {
            FileWriter fw = new FileWriter(new File("lista_zakupow.csv"), true);
            fw.write(text);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
