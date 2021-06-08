import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtils {
    public void saveToFile(String text){
        try {
            FileWriter fw = new FileWriter(new File("sekretnehasla.csv"), true);
            fw.write(text + "\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String readFromFile() {
        String ret = "";
        
        try {
            Scanner nadzieja = new Scanner(new File("sekretnehasla.csv"));
            while(nadzieja.hasNextLine()) {
                String siema = nadzieja.nextLine();
                ret += siema + "\n";
            }
            nadzieja.close();
        } catch (FileNotFoundException e) {
            System.out.println("blad");
        }
        
        return ret;
    }
}
