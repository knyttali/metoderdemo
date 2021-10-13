package se.metoder;

public class LabF3 {
    public int numberOfWords(String mening){
        int antalOrd = 0;
        String[] words = mening.split(" ");
        for (String word : words) {
            antalOrd++;
        }
        return antalOrd;
    }
    public void run(){
        System.out.println("skriv en mening: ");
        String mening = System.console().readLine();
        System.out.println("antalet ord i meningen är " + numberOfWords(mening));
    }
}
/* Write a Java method to count all words in a string. 
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:
Number of words in the string: 9 */