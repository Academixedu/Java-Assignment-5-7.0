// Scanner Implementations

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Enter the empolyee details");
        Scanner sc = new Scanner(System.in);
        Person per = new Person("PSVSAI", 24, 02000, "BDL COLONY");
        System.out.println(per.name);
        System.out.println(per.getAge());
        System.out.println(per.getEsal());
        System.out.println(per.Eadd);
        Childclass child = new Childclass();
        child.nam1();
        child.surnam1();
    }
}
