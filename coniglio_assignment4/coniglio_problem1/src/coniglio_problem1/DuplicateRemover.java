package coniglio_problem1;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
    Set<String> uniqueWords;
    void remove(String dataFile) {
        Scanner input = null;
        try {
            uniqueWords = new LinkedHashSet<>(); 
            input = new Scanner(new File(dataFile)); 
            while(input.hasNextLine()){
                String line = input.nextLine(); 
                String[] words = line.split(" "); 
                for(int i=0;i<words.length;i++) {
                    String str = words[i].toLowerCase(); 
                    uniqueWords.add(str); 
                }
            }

        }
        catch(Exception e){
            System.out.println("Error while opening file: "+dataFile);
        }
        if(input!=null)
            input.close();

    }
    void write(String outputFile){
        FileWriter output = null;
        try {
            output = new FileWriter(outputFile); 
            for(String word:uniqueWords) 
                output.write(word+"\n"); 
            output.close(); 
        }
        catch(Exception e){
            System.out.println("Error while writing to file: "+outputFile);
        }
    }
}
