// Scanner Implementations

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int a;
        int b;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        a=sc.nextInt();
        System.out.println("enter b number");
        b=sc.nextInt();
        IfElse num=new IfElse();
        num.number(a,b);

     //loops  
        Loops lp=new Loops();
        lp.floop(a);
        lp.wloop(b);
     //constructor   
     Person p=new Person(22,"cse",123,"sri");
    System.out.println(p.getAge());
    p.setAge(18);
    System.out.println(p.getAge());
    System.out.println(p.getDept());
    p.setDept("ece");
    System.out.println(p.getDept());

    // parent
    ParentClass ps=new ParentClass();
    System.out.println(ps.Name("syam"));
    }
}