public class Person{
  // Take 4 Variables and Initialize them
  // Create Getters and Setters
  // Create Constructors
}
public class personclass extends parentclass {
    public String name;
    public int age;
    private String addres;
    private int id;
    public personclass(String name, int age, String addres, int id) {
        this.name = name;
        this.age = age;
        this.addres = addres;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
