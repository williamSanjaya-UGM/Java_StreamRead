package streamLine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            //Stream usually uses for the binary files. It uses bytes to do input and output files
            FileInputStream in=new FileInputStream("flower.jpg");
            FileOutputStream out = new FileOutputStream("newflower.jpg");
            int c;
            while ((c=in.read()) !=-1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
