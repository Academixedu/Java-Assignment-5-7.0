public class Loops{
public void ForloopExample()
{
   for(int i=1;i<10;i++)
   {
    System.out.println(i);
   } // Prepare a For Loop and While  in each Function
}
public void WhileloopExample()
{
int i=0;
while(i<10)
{
    System.out.println(i);
    i++;
}
}
public static void main(String args[])
{
    Loops l=new Loops();
    l.ForloopExample();
    l.WhileloopExample();
}
}