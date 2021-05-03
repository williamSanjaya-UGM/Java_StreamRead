package streamReadConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // Variation of take input not by using scanner, but using BufferedReader
    // so that we can get each index from the String[] array
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] consoleInput=bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String firstName=consoleInput[0];
        String lastName=consoleInput[1];
        String gender=consoleInput[2];

        System.out.println("firstname: "+firstName);
        System.out.println("firstname: "+lastName);
        System.out.println("firstname: "+gender);
    }
}
