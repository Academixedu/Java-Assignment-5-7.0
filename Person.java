public class Person {
  // Take 4 Variables and Initialize them
  // Create Getters and Setters
  // Create Constructors
  private String myName;
  private int age;
  private String address;
  public Person(String name, int ag, String addr) {
    myName = name;
    age = ag;
    address = addr;
}
public String getmyName() {
  return myName;
}

public void setmyName(String name) {
  myName = name;
}


public int getAge() {
  return age;
}

public void setAge(int ag) {
  age = ag;
}

public String getAddress() {
  return address;
}

public void setAddress(String addr) {
  address = addr;
}
public static void main(String[] args) {
Person person = new Person("Chinmay", 18, "Hyderabad");

        System.out.println("Person: " + person.getmyName()  );
         System.out.println("Age: " + person.getAge() );
         System.out.println("Address: " + person.getAddress());
    }
}