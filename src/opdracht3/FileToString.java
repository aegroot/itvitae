package opdracht3;

import opdracht2.crypter.Alphabet;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileToString {
    public static String readFile(String path){

BufferedReader reader=null;
        try {
             reader= Files.newBufferedReader(Path.of(path));

             StringBuilder sb=new StringBuilder();
             String line=reader.readLine();


             while (line!=null){
                 System.out.println(line);

                 sb.append(line);

                 line=reader.readLine();
             }
             return  sb.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return  "";
    }

    public static void letterFrequenties(String string){
        ArrayList<CountInstance>instances=CountInstance.generateInstances();



        char[] file=string.toCharArray();


        for (char c:file){
            CountInstance.compareValues(String.valueOf(c),instances);


        }
        System.out.println(instances);

    }


}
