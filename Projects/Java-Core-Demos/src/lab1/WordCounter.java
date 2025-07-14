package lab1;

import java.util.Scanner;

public class WordCounter {

    public static int wordCounter(String sentence){
            String[] components = sentence.split("\\s+");
            int count = 0;

            for (String word : components){
                if(!word.matches("\\d+")){
                    count++;
                }
            }
            return count;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();
        int wordCount =  wordCounter(input);
        System.out.println("Number of words: "+wordCount);
        scanner.close();
    }
}
