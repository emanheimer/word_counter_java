import java.util.Scanner; 
import java.io.*;
import java.io.BufferedReader;
    public class WordCounter{
        public static void main (String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);//creates Scanner object
            System.out.print("Enter input file path:");
            String inFile = scanner.next();
            System.out.println("You entered: " + inFile); 
            FileInputStream fs = new FileInputStream(inFile);
            InputStreamReader input = new InputStreamReader(fs); 
            BufferedReader reader = new BufferedReader(input);//creates BufferReader object
            int wordCount = 0;//intializes word count to zero
            String line;
            while((line = reader.readLine())!=null) //Reading line by line until end of file
            {
                 String[] wordList = line.split("\\s+"); 
                 wordCount += wordList.length;
            }
            fs.close();
            System.out.println("Number of words in the file: " + wordCount); //Print the word count
    }
       
}
