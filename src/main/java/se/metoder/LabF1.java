package se.metoder;

public class LabF1 {
    public int smallestNumber(int tal1, int tal2, int tal3) {
        if (tal1 < tal2 && tal1 < tal3) {
            return tal1;
        }
        if (tal2 < tal1 && tal2 < tal3) {
            return tal2;
        }
        return tal3;
    }

    public void run() {
        System.out.println("skriv tal nr 1: ");
        int tal1 = Integer.parseInt(System.console().readLine());
        System.out.println("skriv tal nr 2: ");
        int tal2 = Integer.parseInt(System.console().readLine());
        System.out.println("skriv tal nr 3: ");
        int tal3 = Integer.parseInt(System.console().readLine());
        
        int minstaTalet = smallestNumber(tal1, tal2, tal3);
        System.out.println("det minsta av talen är " + minstaTalet);
    }
}
/**
 * Write a Java method to find the smallest number among three numbers. Test
 * Data: Input the first number: 25 Input the Second number: 37 Input the third
 * number: 29 Expected Output:
 * 
 * The smallest value is 25
 * 
 * (OBS! För att metoden ska vara återanvändbar - den ska ta tre parametrar .
 * Och RETURNERA ett tal). DVS Ingen input/output i funktionen
 */