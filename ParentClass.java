public class ParentClass
{
  // prepare a method Name with name as parameter and return it by using String return type

  public String meth3()
  {

   return new Basic().meth4(" is awesome");
  }

  public String meth4(String s)
  {
   return s;
  }

  public static void main(String[] args)
   {
      ParentClass obj=new ParentClass();
    System.out.println("Java"+ obj.meth3());
  }



 
}
