package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        
        // intantiation of objects
        Fan1 f1 = new Fan1();
        Fan2 f2 = new Fan2();
        Fan3 f3 = new Fan3();
        

        // WE Access the methods of objects here ⬇⬇⬇
        // Fan 1
        f1.color();
        f1.switch1();
        f1.switch2();
        f1.switch3();
        f1.switch4();

        System.out.println();
        // Fan 3
        f2.color();
        f2.switch1();
        f2.switch2();
        f2.switch3();
        f2.switch4();

        System.out.println();
        // Fan 3
        f3.color();
        f3.switch1();
        f3.switch2();
        f3.switch3();
        f3.switch4();
        
        
    }
}
