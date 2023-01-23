package itvitae.opdracht3;

public class runner {
    public static void main(String[] args) {

        String filePath="src/java.opdracht2/textfile";

        String file=FileToString.readFile(filePath);
        FileToString.letterFrequenties(file);


    }
}
