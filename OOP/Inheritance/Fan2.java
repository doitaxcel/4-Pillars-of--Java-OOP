package OOP.Inheritance;

// extends keyword is used to inherit the method
// from the Super Class (ElectricFan.java)
public class Fan2 extends ElectricFan{
    
    private String color ="Silver";
    
    public void color(){
        System.out.println("Fan 2 Color: " + color);
    }

}
