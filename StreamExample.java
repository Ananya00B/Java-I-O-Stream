import java.io.*;

public class StreamExample {
    public static void main (String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader (System.in);
        int c;
        
        c = inp.read();
        while ((char)c != 'q') {            // cast the input to char
            System.out.print((char)c);      
            c = inp.read();
        }
        System.out.println("\nTHE END");
    }
}
