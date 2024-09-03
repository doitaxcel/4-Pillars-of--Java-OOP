package OOP.Abstraction;

public class bDog extends bAnimals{
    
    // name, breed, poop, pee are methods from
    // the abstract class..
    // the body of methods should be declared
    // in other class.
    // like this example

    public void name(){
        System.out.println("Dog Name");
    }

    public void breed(){
        System.out.println("Dog Breed");
    }

    public void poop(){
        System.out.println("pooping...");
    }

    public void pee(){
        System.out.println("peeing.");
    }

}
