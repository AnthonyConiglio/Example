package coniglio_problem2;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter{
private HashMap<String, Integer> counter = new HashMap<String, Integer>();

   public void count(String dataFile){
       counter.clear();
       Scanner input = null;
       try{
           input = new Scanner(new File(dataFile));
           while(input.hasNextLine()){
               String word = input.next();
               word = cleanUp(word);
               if(!word.equals("")) {
                   if(counter.get(word) == null)
                       counter.put(word, 1);
                   else
                       counter.put(word, counter.get(word) + 1);
               }
           }
           input.close();
       }
       catch(Exception e){
           System.out.println("Error while opening file: "+dataFile);
       }
   }


   public void write(String outputFile){
	   PrintWriter output = null;
	   try{
           output = new PrintWriter(new File(outputFile));
           for(String word : counter.keySet()){
               output.println(word + " " + counter.get(word));
           }
           output.close();
       }
       catch(Exception e){
           System.out.println("Error while opening file: "+outputFile);
       }
   }

   private String cleanUp(String word){
       String temp = (""+"");
       for(int i = 0; i < word.length(); i++){
           char count = word.charAt(i);
           if(Character.isAlphabetic(count))
               temp += count;
       }
       return temp.toLowerCase().trim();
   }
}