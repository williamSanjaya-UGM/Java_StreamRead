package FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName="scoring.txt";
        try(FileInputStream fileStream =new FileInputStream(fileName)){
            StringBuilder sb = new StringBuilder();
            int c;
            while((c=fileStream.read()) !=-1) {
                sb.append((char) c);
            }

            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
