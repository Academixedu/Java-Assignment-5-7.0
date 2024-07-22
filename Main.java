// Scanner Implementations

import java.util.Scanner;

public class Main{
public static void main(String args[]){
Person fu = new Person("sai",456 , 23, 1234567);
    fu.getName();
    fu.getNo();
    fu.getAge();
    fu.getPhno();
    System.out.println("name is: "+fu.getName());
    System.out.println("no is: "+fu.getNo());
    System.out.println("age is: "+fu.getAge());
    System.out.println("phno is: "+fu.getPhno());
    child ch = new child();
    ch.name();
    ch.surname(" ");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter age: ");
    int num  = sc.nextInt();
    IfElse in  = new IfElse();
    in.age(num);
    Loops ls = new Loops();
    ls.a(0);
    ls.sd(0);
} 
}
