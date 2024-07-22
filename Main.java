// Scanner Implementations

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //setters and getters//
        Person sc = new Person("kavitha","vijayawada",21,987654321);
        sc.setMyage(21);
        sc.setMyphoneno(987654321);
        System.out.println("my name is "+sc.getMyname());
        System.out.println("my address is "+sc.getMyaddress());
        System.out.println("my age is "+sc.getMyage());
        System.out.println("my phoneno is "+sc.getMyphoneno());
        
        //loops//
        Loops in = new Loops();
        in.forloop();
        in.whileloop();

        //parentclass//
        child c3 =new child();

        String c4= c3.surname1("kavitha");
        String c5=c3.address1("eluru");
        System.out.println(c4);
        System.out.println(c5);

        
        
        
    }
}
