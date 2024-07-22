import java.util.Scanner;


public class Main {
    public static int sum(int a,int b){
        return  a+b;
    }
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        sum(a,b);

        Person ps=new Person(12, "sarvesh","Bramhane", 8000);
        ps.setId(10);
        ps.setName("Sarvesh");
        ps.setSurname("Bramhane");
        ps.setSal(1000000);
        System.out.println(ps.getId());
        System.out.println(ps.getName());
        System.out.println(ps.getSurname());
        System.out.println(ps.getSal());

        new Loops().l1();
        new Loops().l2();

    System.out.println(ParentClass.p1("sarvesh"));   
        
    }
    
}
