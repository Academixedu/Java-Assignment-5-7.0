public class Person{
  // Take 4 Variables and Initialize them
  // Create Getters and Setters
  // Create Constructors
  public String name;
  private int age;
  private double Esal;
  public String Eadd;
  public String getname() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public double getEsal() {
    return Esal;
  }
  public String getEadd() {
    return Eadd;
  }
  public void setEname(String ename) {
    name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setEsal(double esal) {
    Esal = esal;
  }
  public void setEadd(String eadd) {
    Eadd = eadd;
  }
  public Person(String name, int age, int esal, String eadd) {
    this.name = name;
    this.age = age;
    this.Esal = esal;
    this.Eadd = eadd;
  }

}
