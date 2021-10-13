package se.metoder;

public class LabF4 {
    public int summaAvSiffror(int digits){
        int result = 0;

        while (digits>0){
            result =  result+ (digits % 10);
			digits = digits / 10;
        }
        return result;
    }
    public void run(){
        System.out.print("Skriv en siffra: ");
        int digits = Integer.parseInt(System.console().readLine());
        System.out.println("The sum is " + summaAvSiffror(digits));
    }

}
/** Write a Java method to compute the sum of the digits in an integer. 
Test Data:
Input an integer: 25
Expected Output: 
The sum is 7 

*/