import java.util.Scanner; 
import java.io.*;
    public class WordCounter{
        public static void main (String[] args) throws Exception {
            Scanner keyboard = new Scanner(System.in);//creates Scanner object that reads from keyboard 
            System.out.print("Enter file path:");//prompts user for file path
            String filePath = keyboard.nextLine();//stores file path from user in string
            System.out.println("You entered: " + filePath); 
            
            // Open the file
            File file = new File(filePath);
            Scanner fileReader = new Scanner(file,"ISO-8859-1");
            
           int wordCount = 0;//intializes word count to zero
           
            // Read until the end of the file.
            while (fileReader.hasNext())
                {  
                  String str = fileReader.nextLine(); 
                  String[] wordList = str.split("\\s+");
                  wordCount += wordList.length;
                }
            System.out.println("This file contains " + wordCount + " words.");
            fileReader.close();// close the file when done
        }
    }

