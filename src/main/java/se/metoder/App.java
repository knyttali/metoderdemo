package se.metoder;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*Demo demo = new Demo();
        demo.run();
        LabF1 lab1 = new LabF1();
        lab1.run();
        LabF2 lab2 = new LabF2();
        lab2.run();
        LabF3 lab3 = new LabF3();
        lab3.run();
        LabF4 lab4 = new LabF4();
        lab4.run();*/
        LabF5 lab5 = new LabF5();
        lab5.run();
    }
}