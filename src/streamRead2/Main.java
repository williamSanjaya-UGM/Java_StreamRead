package streamRead2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        InputStream inputStream = new FileInputStream("scoring.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        while((line= br.readLine())!=null){
            stringBuilder.append(line+System.lineSeparator());
        }
        System.out.println(stringBuilder.toString());
    }
}
