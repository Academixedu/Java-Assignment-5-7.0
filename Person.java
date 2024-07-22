public class Person{
  // Take 4 Variables and Initialize them
  // Create Getters and Setters
  // Create Constructors
  private String name;
  private int id;
  private int age;
  private String role;
  public Person(String name, int id, int age, String role) {
    this.name = name;
    this.id = id;
    this.age = age;
    this.role = role;
  }
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
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
}
