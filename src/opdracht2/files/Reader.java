package opdracht2.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Reader {

    public static BufferedReader readFile(Path path) throws IOException {
        BufferedReader reader= Files.newBufferedReader(path);


        return  reader;}
}
