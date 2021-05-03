package printWriterSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",8080);
//        PrintWriter pw = new PrintWriter(s.getOutputStream());

        InputStreamReader in = new InputStreamReader(System.in); // to get input
        BufferedReader br = new BufferedReader(in);

        PrintWriter pw = new PrintWriter(s.getOutputStream());
        pw.println(br.readLine());
        pw.flush();
    }
}
