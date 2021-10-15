package se.metoder;

public class LabF7 {
    public void run() {
        System.out.println("skriv din lön: ");
        double salary = Double.parseDouble(System.console().readLine());
        double taxes = CalculateTaxesOnSalary(salary);
        System.out.println(taxes);
    }

    public double CalculateTaxesOnSalary(double salary) {
        double taxes = 0;
        if (salary >= 30000) {
            taxes = salary * 0.33;
        } else if (salary >= 15000) {
            taxes = salary * 0.28;
        } else {
            taxes = salary * 0.12;
        }

        return taxes;
    }
}
/**
 * Skapa en funktion som heter CalculateTaxesOnSalary
 * 
 * 
 * Den tar som inparameter ett tal (lönen). Om Månadslön >= 30000 tar man lön *
 * 0,33
 * 
 * om Månadslön < 15000 så lön * 0,12
 * 
 * om Månadslön <30000 så lön * 0,28
 * 
 * Returnera den beräknade skatten.
 * 
 */