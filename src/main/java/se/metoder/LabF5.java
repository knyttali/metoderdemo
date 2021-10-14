package se.metoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabF5 {
    public void validPassword(String passWord) {
        int antalSiffror = 0;                                              //kollar så password endast består av siffror och bokstäver
        int antalBokstaver = 0;
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(passWord);
        boolean b = m.find();

        for (int i = 0; i < passWord.length(); i++) {                     //kollar på det är minst 2 siffror och minst 8 tecken totalt
            Boolean arSiffra = Character.isDigit(passWord.charAt(i));
            if (arSiffra) {
                antalSiffror++;
            } else {
                antalBokstaver++;
            } 
        }

        if (b && passWord.length() < 8 || antalBokstaver < 1 || antalSiffror < 2) { // kollar så det endast är siffror och bokstäver + så det är minst 8 tecken
            System.out.println("ogiltigt lösenord");
        }
    }

    public void run() {
        meny();
        System.out.println("Input a password: ");
        String passWord = System.console().readLine();
        validPassword(passWord);
    }

    public void meny() {
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must constain at least two digits.  ");
    }
}
/**
 * Write a Java method to check whether a string is a valid password. Password
 * rules: A password must have at least eight characters. A password consists of
 * only letters and digits. A password must contain at least two digits.
 * 
 * Expected Output:
 * 
 * 1. A password must have at least eight characters. 2. A password consists of
 * only letters and digits. 3. A password must contain at least two digits Input
 * a password : abcd1234 Password is valid: abcd1234 TIPS: Låt funktionen
 * RETURNERA en felttext - som kan vara TOM ifall OK
 */