package se.metoder;

public class LabF2 {
    public boolean CanBuyBeer(int age, char location){
        if(age >= 18 && location == 'k'){
            return true;
        } 
        if (age >= 20){
            return true;
        }
        return false;
    }
    public void run(){
        System.out.println("skriv din ålder: "); 
        int age = Integer.parseInt(System.console().readLine());
        System.out.println("krogen (k) eller systemet (s): ");
        String location1 = System.console().readLine();
        char location = location1.charAt(0);
        boolean canIBuyBeer = CanBuyBeer(age, location);

        if (canIBuyBeer){
            System.out.println("du får köpa öl");
        } else {
            System.out.println("du får EJ köpa öl");
        }
        
    }
}
/**Skriv en funktion som heter CanBuyBeer
Den ska RETURNERA en boolean (true eller false)
Inparametrar: age (int)
              location char (K betyder krogen, S betyder systemet)  
REGLERNA ÄR JU:

Om man är äldre än/lika med 18 och    på krogen       

Om man är äldre än/lika med 20 och    på systemet


Skriv kod som anropar matar in värden och sen anropar funktionen! */