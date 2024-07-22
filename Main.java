// Scanner Implementations

import java.util.Scanner;

public class Main{
     public static void main(String[] args) {
        int a;
        int b;
        System.out.println("enter A value");
        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        System.out.println("enter B value");
        b=scan.nextInt();
        IfElse in= new IfElse();
        System.out.println(in.name(a,b));
        Loops yono=new Loops();
        System.out.println(yono.name(a));
        System.out.println(yono.While(b));
        Person per=new Person("nayeem",3423,25,"devoloper");
        System.out.println("name is :"+per.getName());
        System.out.println("id is :"+per.getId());
        System.out.println("age is :"+per.getAge());
        System.out.println("role is :"+per.getRole());
        Child son1=new Child();
        son1.surname("nayeem");
        son1.son("asta");

        

    }
}
