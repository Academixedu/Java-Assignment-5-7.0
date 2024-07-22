import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    int a;
    int b;
    System.out.println("enter a value");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    System.out.println("enter b value");
    b= sc.nextInt();
    IfElse f = new IfElse();
    f.ife(a,b);
    Loops l = new Loops();
    l.loop();
    l.While(b);
    Person p = new Person("goutham",1,21 , "developer");
    System.out.println("name is :"+p.getName());
    System.out.println("id is :"+p.getId());
    System.out.println("age is :"+p.getAge());
    System.out.println("role is :"+p.getRole());
    Child c=new Child();
    c.Name("name is");
    c.name();


}
}
