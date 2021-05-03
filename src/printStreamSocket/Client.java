package printStreamSocket;

import java.io.*;
import java.net.Socket;

public class Client {

    // PrintStream is almost identical with PrintWriter,
    // PrintStream writes raw bytes in the machine’s native character format, and PrintWriter converts bytes to recognized encoding schemes
    // Thus, files created with PrintWriter are more compatible across different platforms than files created with PrintStream
    // In general, you should use PrintWriter rather than PrintStream
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",8080);

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintStream pw = new PrintStream(s.getOutputStream());
        pw.println(br.readLine());
        pw.flush();
    }
}
