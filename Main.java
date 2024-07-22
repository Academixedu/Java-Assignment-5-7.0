// Scanner Implementations

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a value");
        int a =scan.nextInt();
        System.out.println("enter b value");
        int b =scan.nextInt();
        Person p1=new Person("Swarupa", 21, 9849, "Hyderabad");
         System.out.println(p1.name);
         System.out.println(p1.getAge());
         System.out.println(p1.getId());
         System.out.println(p1.adress);

         Loops lo = new Loops();
         lo.forLoop(a);
         lo.wloop(b);
         child ch=new child();
         System.out.println(ch.Surname("Jangam"));
         System.out.println(ch.name("Swarupa"));

         //for(3);
         //while(4);
        }
    }
