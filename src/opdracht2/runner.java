package opdracht2;

import opdracht2.crypter.Encrypter;
import opdracht2.files.Writer;

public class runner {
    public static void main(String[] args) {
        String filePath="src/opdracht2/textfile";


        String enc= Encrypter.encryptFile(filePath, 5);
        Writer.writeToFile(enc,"encrypted");

        System.out.println(enc);

    }
}
