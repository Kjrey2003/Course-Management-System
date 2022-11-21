import java.net.*;
import java.io.*;

public class Student {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("local student", 4999);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("hello");
        pr.flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("teacher : " + str);

    }
} // I made in which a student and teacher will communicate with each other back and forth.
// For this class, I used PrintWriter.
// To also help with making this code, I use java.net socket class instead of the native code
// I did this because Java programs can communicate over the network in a platform-independent fashion when using Socket class
