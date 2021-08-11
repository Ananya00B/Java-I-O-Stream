import java.io.*;

public class ReaderExampleTryCatch {
    public static void main(String[] args){
    	FileReader infp;
    	FileWriter ofp;
    	try {
    		infp = new FileReader (args[0]);
    		ofp = new FileWriter (args[1]);
    		int ch;
        
    		while ((ch = infp.read()) != -1) {
    			ofp.write(ch);
    		}
    		
    		infp.close();
            ofp.close();
    	}catch(IOException e) {
    		System.out.println(e);
    	}
    	
    	finally {
    		System.out.println("THE END");
    	}
    }
}
