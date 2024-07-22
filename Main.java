
import java.util.Scanner;

// Scanner Implementations
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a value");
        int a =scan.nextInt();
        System.out.println("Enter b value");
        int b = scan.nextInt();
        System.out.println();

        //IF ELSE
        System.out.println("IF-ELSE");
        System.out.println("----------");
        int age;
        System.out.println("Enter age");
        age = scan.nextInt();
        IfElse in = new IfElse();
        in.f1(age);
        System.out.println();

        //LOOPS
        System.out.println("LOOPS");
        System.out.println("----------")
;        Loops lo = new Loops();
        int a1= lo.forLoop(a);
        int b1= lo.whileLoop(b);
        System.out.println("for loop a value "+a1);
        System.out.println("While loop b value "+b1);
        System.out.println();

        //INHERITANCE
        System.out.println("INHERITANCE");
        System.out.println("----------");
        Child c = new Child();
       String pname = c.parentname("RAMBABU");
        System.out.println("parent name is "+pname);
        c.childname();
        System.out.println();
        
        //person
        System.out.println("PERSON DETAILS");
        System.out.println("----------");
        Person p = new Person(47, "MANISUGGUNA", "DEVELOPER", 100000);
        
        System.out.println("Person id is "+p.getId());
        System.out.println("Person name is "+p.getName());
        System.out.println("Person job is " +p.getJob());
        System.out.println("Person salary is "+p.getSalary());
        
    }
}