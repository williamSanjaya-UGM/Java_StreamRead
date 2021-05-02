package streamRead;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("scoring.txt");

        // For a simple read fileInputStream
//        int i=0;
//        while((i=in.read())!=-1){
//            System.out.print((char)i);
//        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        // do buffer readLine, which shows first 6 data rows
        List<String> scoringLists = IntStream.range(0,6).mapToObj(i->{
            try{
                return bufferedReader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());

        System.out.println(scoringLists);
    }
}
