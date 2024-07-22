import java.util.Scanner;

public class Main
 {     

    void meth2()
    {
        Scanner sc=new Scanner(System.in);

         System.out.print("Enter the value of a :");
         int a=sc.nextInt();

        System.out.print("Enter the value of b :");
         int b=sc.nextInt();
         sc.nextLine();

         System.out.print("The Value of string s: ");
         String s=sc.nextLine();

         System.out.println("The Value of a: "+a);
         System.out.println("The Value of b: "+b);
         System.out.println("The Value of String s: "+s);
    }

      public static void main(String[] args) 
      {
       // new Main().meth2();
        System.out.println("---------------------------------------");

       Person obj=new Person(25, 45, "shreyas", "Ratan");
     // Person obj=new Person();
        obj.setA(69);
        obj.setB(81);
        obj.setC("Abhi");
        obj.setS("Choudhari");

        System.out.println("the value of a : "+obj.getA());
        System.out.println("the value of b : "+obj.getB());
        System.out.println("the value of String s : "+obj.getC());
        System.out.println("the value of string C : "+obj.getS());

      }
 }
