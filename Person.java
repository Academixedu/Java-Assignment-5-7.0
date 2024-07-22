public class Person{
  // Take 4 Variables and Initialize them
  // Create Getters and Setters
  // Create Constructors
  private String name;
  private int age;
  private String address;
  private String desg;

  public Person(String name, int age, String address, String desg) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.desg = desg;
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
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getDesg() {
    return desg;
  }
  public void setDesg(String desg) {
    this.desg = desg;
  }

}
 