package OOP.Inheritance;

// extends keyword is used to inherit the method
// from the Super Class (ElectricFan.java)
public class Fan3 extends ElectricFan{
    
    private String color ="White";

    public void color(){
        System.out.println("Fan 3 Color: " + color);
    }

}
