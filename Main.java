import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Person n = new Person("fayaz",245,21,"developer");
        System.out.println("name is "+n.getName());
        System.out.println("id is "+n.getId());
        System.out.println("age is "+n.getAge());
        System.out.println(" role is "+n.getRole());
        child pc = new child();
        pc.name("shaik");
        pc.childName("fayaz");
        Loop lo = new Loop();
        System.out.println(Loops.loop(2));
        System.out.println(Loops.While(0));
      //ifelse
        System.out.println("enter a");
        Scanner fa = new Scanner(System.in);
        int na = fa.nextInt();
        System.out.println("enter b");
        int ba  =fa.nextInt();
        IfElse in = new IfElse();
        System.out.println(in.ifC(na,ba));
        


    }

    
    }

// Scanner Implementations
    

