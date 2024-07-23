import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first name: ");
    String firstName = sc.nextLine();

    System.out.print("Enter last name: ");
    String lastName = sc.nextLine();

    System.out.print("Enter age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter address: ");
    String address = sc.nextLine();

    Person person = new Person(firstName, lastName, age, address);
    System.out.println("Person details:");
    System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
    System.out.println("Age: " + person.getAge());
    System.out.println("Address: " + person.getAddress());
  }
}
