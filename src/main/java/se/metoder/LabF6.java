package se.metoder;

import java.lang.reflect.Array;


public class LabF6 {
    public void run(){
        String[] allaOrd = {"Volvo", "BMW", "Ford", "Mazda"};
        String langstaOrdet = HittaLangstaOrdet(allaOrd);
        System.out.println(langstaOrdet);
    }

    public String HittaLangstaOrdet(String[] allaOrd){
        int langdOrd = 0;
        String langstOrd = "";
        for (String ord : allaOrd) {
            if (ord.length() >= langdOrd){
                langdOrd = ord.length();
                langstOrd = ord;
            }
        }        
        return langstOrd;
    }
}
/**Skapa en metod som du döper till HittaLangstaOrdet. 
 * Metoden skall ta som inparameter en array med strängar. 
 * Metoden skall loopa igenom arrayen och returnera det längsta ordet. */