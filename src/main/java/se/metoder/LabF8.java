package se.metoder;

public class LabF8 {
    public void run(){
        System.out.println(vokalLR('b'));
    }

    public boolean vokalLR(char bokstav){
        if (bokstav == 'a' || bokstav == 'y' || bokstav == 'i' || bokstav == 'e' || bokstav == 'u' || bokstav == 'o'){
            return true;
        }
        return false;
    }
}
/**Skapa en metod som tar en bokstav och returnerar true om det är en vokal och false annars.
 */