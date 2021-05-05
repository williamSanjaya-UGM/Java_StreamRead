package FileStream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String fileName="scoring.txt";
        try(FileInputStream fis = new FileInputStream(fileName)) {
            int i=0;
            do{
                byte[] buf = new byte[1024];
                i=fis.read(buf);

                String value = new String(buf, StandardCharsets.UTF_8);
                System.out.println(value);
            } while (i!=-1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
