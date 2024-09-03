package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {

        // intantiation of objects
        Students s1 = new Students();
        Students s2 = new Students();

        s1.setName(null);
        s1.setCourse(null);
        s1.setAge(0);
        s1.setId(0);

        System.out.println(s1.getName());
        System.out.println(s1.getCourse());
        System.out.println(s1.getAge());
        System.out.println(s1.getID());

        System.out.println();

        s2.setName(null);
        s2.setCourse(null);
        s2.setAge(0);
        s2.setId(0);

        System.out.println(s2.getName());
        System.out.println(s2.getCourse());
        System.out.println(s2.getAge());
        System.out.println(s2.getID());


        // s2.setName(null);
        // System.out.println(s2.getName());

    }
}
