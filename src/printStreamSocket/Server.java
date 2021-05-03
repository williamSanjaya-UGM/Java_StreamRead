package printStreamSocket;

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

        BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
        String[] s1 = br.readLine().split(" ");
        System.out.println("firstName: "+s1[0]);
        System.out.println("firstName: "+s1[1]);
        System.out.println("firstName: "+s1[2]);
    }
}
