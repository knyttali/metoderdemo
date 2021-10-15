package se.metoder;

public class LabF9 {
    public void run() {
        String vanligtOrd = "this is fun";
        System.out.println(Translate(vanligtOrd));
    }

    public String Translate(String vanligtOrd) {
        String translation = "";

        //loopar genom ordet
        for (int i = 0; i < vanligtOrd.length(); i++) {
            char bokstav = vanligtOrd.charAt(i);

            // Kollar om varje bokstav är en vokal eller mellanslag
            if (bokstav == 'a' || bokstav == 'y' || bokstav == 'i' || bokstav == 'e' || bokstav == 'u' || bokstav == 'o' || bokstav == 'å'|| bokstav == 'ä'|| bokstav == 'ö'|| bokstav == ' ') {
                //translation börjar från noll och lägger till bokstav för bokstav igen
                translation = translation + bokstav;

            } else {
                translation = translation + bokstav;
                translation = translation + "o";
                translation = translation + bokstav;
            }
        }
        return translation;
    }
}
/**
 * Skriv en metod som du döper till Translate() . Den skall översätta en text
 * till "rövarspråket". Det betyder att dubbla varje konsonant och placera
 * bokstaven ”o” mellan dessa konsonanter. Till example , Translate("this is
 * fun") skall returna strängen "tothohisos isos fofunon".
 */