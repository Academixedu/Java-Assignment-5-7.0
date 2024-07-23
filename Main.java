// Scanner Implementations

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Childclass child = new Childclass();
        child.name();;
        child.surname();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Employee name: ");
        String Name=scan.nextLine();
        System.out.println("Enter Employee Id: ");
        int id = scan.nextInt();
        System.out.println("Enter Employee Age: ");
        int age = scan.nextInt();
        System.out.println("Enter Employee Address: ");
        String address=scan.next();
        Person empDetails = new Person("XYZ", 007 , 30, "BHPK");
        System.out.println("Employee details:");
        System.out.println(Name);
        System.out.println(id);
        System.out.println(age);
        System.out.println(address);

    }
}
