import java.util.jar.Attributes.Name;

public class Person{
  // Take 4 Variables and Initialize them
  public String name;
  public int id;
  private int age;
  private String address;
  // Create Constructors
  public Person(String name, int id, int age, String address){
    this.name = name;
    this.id= id;
    this.age = age;
    this.address = address;
  }
   // Create Getters and Setters
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  
}
