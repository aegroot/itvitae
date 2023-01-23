package itvitae.opdracht2;

import itvitae.opdracht2.files.Writer;
import itvitae.opdracht2.crypter.Decrypter;
import itvitae.opdracht2.crypter.Encrypter;

public class runner {
    public static void main(String[] args) {
        String filePath="src/itvitae/opdracht2/textfile";
        String fileName="encrypted";




        String enc= Encrypter.encryptFile(filePath, 5);
        Writer.writeToFile(enc,fileName);

       String dec= Decrypter.decryptFile("src/itvitae/opdracht2/output/encrypted",5);

        Writer.writeToFile(dec,"decrypted");


        //System.out.println(enc);
        //System.out.println(dec);

    }
}
