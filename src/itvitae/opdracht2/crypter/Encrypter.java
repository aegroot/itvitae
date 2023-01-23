package itvitae.opdracht2.crypter;

import itvitae.opdracht2.files.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Encrypter {
    //public static String output="";



    public static String encryptLine(String value,int toSkip){
        List<String> upperAlphabets= Alphabet.getUpperAlphabets();
        List<String> lowerAlphabets=Alphabet.getLowerAlphabets();


        StringBuilder sb = new StringBuilder();
        int pos = 0, newPos = 0;
        boolean upper;
        for (char c : value.toCharArray()) {
            pos = upperAlphabets.indexOf(String.valueOf(c));
            if (pos == -1) {
                if(!lowerAlphabets.contains(String.valueOf(c))){
                    sb.append(c);
                    continue;

                }
                pos = lowerAlphabets.indexOf(String.valueOf(c));
                upper = false;
            } else {
                upper = true;
            }

            if (pos + toSkip > 25) {
                newPos = (pos + toSkip) % 26;
            } else {
                newPos = pos + toSkip;
            }

            if (upper) {
                sb.append(upperAlphabets.get(newPos));
            } else {
                sb.append(lowerAlphabets.get(newPos));
            }
        }





        return sb.toString();
    }

    public static  String encryptFile(String filePath, int key) {


        StringBuilder resultStringBuilder = new StringBuilder();

        BufferedReader reader= null;
        try {
            reader = Reader.readFile(Paths.get(filePath));
            String line=reader.readLine();


            while (line!=null){


                String enc=encryptLine(line,key);
                //System.out.println(enc);
                resultStringBuilder.append(enc).append(" \n ");

                line=reader.readLine();
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return  resultStringBuilder.toString();}

        private static int generateKey(){return  0;}

}
