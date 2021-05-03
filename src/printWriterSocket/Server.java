package printWriterSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();

        System.out.println("Client connected");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String text = br.readLine();
        System.out.println("client: "+text);
    }
}
