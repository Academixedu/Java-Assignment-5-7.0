

import java.util.Scanner;
class Main{
public static void main(String[] args){

 Scanner sc=new Scanner(System.in);
    Loops obj=new Loops();
    System.out.println("enter a");
    int a=sc.nextInt();
    System.out.println("enter b");
    int b=sc.nextInt();
    obj.a1(a);
    obj.a2(b);
    IfElse obj1=new IfElse();
    obj1.b1(a,b);
   Person obj3=new Person(1,"sri",24,"ECE"); 
   System.out.println(obj3.getSname());
   obj3.setSname("keerthana");
   System.out.println(obj3.getSname());
  System.out.println(obj3.getSroll());
  obj3.setSroll(65);
  System.out.println(obj3.getSroll());
  System.out.println(obj3.getSdept());
  obj3.setSdept("CSE");
  System.out.println(obj3.getSdept());
ParentClass obj4=new ParentClass();
System.out.println(obj4.Name("syam"));


}}