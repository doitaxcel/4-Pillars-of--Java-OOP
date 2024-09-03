package OOP.Encapsulation;

public class bMain {
    public static void main(String[] args) {
        // intantiation of objects
        bStudent s1 = new bStudent();
        bStudent s2 = new bStudent();

        // put your values inside the () 😁
        s1.setName(null);
        s1.setCourse(null);
        s1.setAge(0);
        s1.setId(0);

        System.out.println();

        // prints the values from your input to console
        System.out.println(s1.getName()); 
        System.out.println(s1.getCourse());
        System.out.println(s1.getAge());
        System.out.println(s1.getId());

        //System.out.println();

        //example #2 (same concept)
        s2.setName(null);
        s2.setCourse(null);
        s2.setAge(0);
        s2.setId(0);

        System.out.println();

        System.out.println(s2.getName()); 
        System.out.println(s2.getCourse());
        System.out.println(s2.getAge());
        System.out.println(s2.getId());
    }
}
