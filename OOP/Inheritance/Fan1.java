package OOP.Inheritance;

// extends keyword is used to inherit the method
// from the Super Class (ElectricFan.java)
public class Fan1 extends ElectricFan{

    private String color ="Black";

    public void color(){
        System.out.println("Fan 1 Color: " + color);
    }
}
