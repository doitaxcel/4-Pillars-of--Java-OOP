package OOP.Polymorphism;

class Vehicle{
    public void Horn(){
        System.out.println("Beep Beep Beep");
    }
}

// without this method.. of motor object is called
// and use the method Horn()..
// the default horn will be "Beep Beep Beep"
// but since there are Horn/s declared..
// "Beep Beep Beep" got overwritten

class Motor extends Vehicle{
    
    public void Horn(){ 
        System.out.println("Siiitt Siiiit Siiit"); // Motor horn new sound
    }
}

class Car extends Vehicle{
    public void Horn(){
        System.out.println("Enkk Enkk Enkk"); // Car horn new sound
    }
}

class Truck extends Vehicle{
    public void Horn(){
        System.out.println("Honkkkkk Honkkk Honkkk"); // Truck horn new sound
    }
}

public class Main {
    public static void main(String[] args) {

        // intantiation of objects);
        Motor m = new Motor();
        Car c = new Car();
        Truck t = new Truck();

        
        m.Horn();
        c.Horn();
        t.Horn();

        
    }
}
