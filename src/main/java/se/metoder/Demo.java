package se.metoder;

import java.util.ArrayList;

public class Demo {
    public void run() {
        ArrayList<String> allaNamn = new ArrayList<>();
        allaNamn.add("amanda");
        allaNamn.add("anna");
        allaNamn.add("emeli");

        ArrayList<String> filtered = filterWithXOrMoreChars(allaNamn, 5);
        for(String s : filtered){
            System.out.println(s);
        }
    }
    public ArrayList<String> filterWithXOrMoreChars(ArrayList<String> input, int x){
        ArrayList<String> result = new ArrayList<String>();
        for (String s : input) {
            if (s.length()>= x){
                result.add(s);
            }
        }
        return result;
    }
}
