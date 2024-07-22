
// Scanner Implementations
import java.util.Scanner;
public class Main{
public static void main(String args[])
{
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the number");
    int a=sc.nextInt();
    IfElse.ife(a);
    Loops.For(a);
    Loops.While(a);
    Person p=new Person(1, "gani", 22, 25000);
    System.out.println(p.getName());
    System.out.println(p.getAge());
    System.out.println(p.getId());
    System.out.println(p.getSalary());
    p.setAge(12);
    p.setId(2);
    System.out.println(p.getAge());
    System.out.println(p.getId());
    ParentClass n=new ParentClass();
    System.out.println(n.Surname("gani"));
}
}
