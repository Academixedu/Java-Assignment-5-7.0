public class Person{
  // Take 4 Variables and Initialize them
  private int id;
  private String name;
  private int age;
  private float salary;
  // Create Getters and Setters
  public int getId() {
    return id;
  }
  public void setId(int id) {
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
  public float getSalary() {
    return salary;
  }
  public void setSalary(float salary) {
    this.salary = salary;
  }
  //create constructors
  public Person(int id, String name, int age, float salary) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
  
  
}
