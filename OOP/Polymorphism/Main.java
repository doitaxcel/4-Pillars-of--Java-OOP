package OOP.Polymorphism;

class Vehicle{
    public void Horn(){
        System.out.println("Beep Beep Beep");
    }
}

class Motor extends Vehicle{
    public void Horn(){
        System.out.println("Siiitt Siiiit Siiit");
    }
}

class Car extends Vehicle{
    public void Horn(){
        System.out.println("Enkk Enkk Enkk");
    }
}

class Truck extends Vehicle{
    public void Horn(){
        System.out.println("Honkkkkk Honkkk Honkkk");
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
