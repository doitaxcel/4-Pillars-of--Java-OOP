package OOP.Encapsulation;

public class bStudent {
    private String name, course;
    private int age, id;
    
    // NAME set & get
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // COURSE set & get
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    //AGE set & get
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // ID set & get
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
