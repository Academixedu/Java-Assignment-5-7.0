public class Loops
{
// Prepare a For Loop and While  in each Function

public void loopWhile()
{
    int i=1;
     while (i<=5)
     {
          System.out.println("Ratan: "+i);
          i=i+1;
     }
     System.out.println("-----------------------------------");
     
}
 
public void loopFor()
{
    int i=1;
    for (;i<=5;)
    {
        System.out.println("Mr. Ratan : "+i );
        i=i+1;
    } 
    System.out.println("-----------------------------------");
}


public static void main(String[] args) 
{
      Loops obj=new Loops();   
      obj.loopWhile();
      obj.loopFor();
}
}
