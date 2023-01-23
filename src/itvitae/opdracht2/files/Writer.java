package itvitae.opdracht2.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void writeToFile(String data,String filename){
        File file=null;

        String filepath="src/itvitae/opdracht2/output"+"/"+filename;

        file=new File(filepath);
        FileWriter writer=null;

        try {
           writer=new FileWriter(filepath);
           writer.write(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                assert writer != null;
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
