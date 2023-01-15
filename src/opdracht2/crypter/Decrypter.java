package opdracht2.crypter;

import opdracht2.files.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Decrypter {







    public static  String decryptFile(String filePath,int key){

        StringBuilder resultStringBuilder = new StringBuilder();

        BufferedReader reader= null;
        try {
            reader = Reader.readFile(Paths.get(filePath));



        String line=reader.readLine();
        while (line!=null){

            line=reader.readLine();
            String enc=decryptLine(line,key);
            resultStringBuilder.append(line).append("/n");
        }

        reader.close(); }

catch (IOException e) {
            e.printStackTrace();
        }


        return  resultStringBuilder.toString();}

    public static String decryptLine(String value,int toSkip){
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
                newPos = (pos - toSkip) % 26;
            } else {
                newPos = pos - toSkip;
            }

            if (upper) {
                sb.append(upperAlphabets.get(newPos));
            } else {
                sb.append(lowerAlphabets.get(newPos));
            }
        }





        return sb.toString();
    }

}
