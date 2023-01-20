package opdracht2;

import opdracht2.crypter.Decrypter;
import opdracht2.crypter.Encrypter;
import opdracht2.files.Writer;

public class runner {
    public static void main(String[] args) {
        String filePath="src/opdracht2/textfile";
        String fileName="encrypted";




        String enc= Encrypter.encryptFile(filePath, 5);
        //Writer.writeToFile(enc,fileName);

       String dec= Decrypter.decryptFile("src/opdracht2/output/encrypted",5);

        Writer.writeToFile(dec,"decrypted");


        //System.out.println(enc);
        //System.out.println(dec);

    }
}
