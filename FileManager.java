import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileManager {

    public static void save(String data) {
        try {
            FileWriter fw = new FileWriter("receipt.txt", true);
            fw.write(LocalDateTime.now() + " | " + data + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}