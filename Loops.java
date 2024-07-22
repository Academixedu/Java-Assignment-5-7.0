public class Loops{
// Prepare a For Loop and While  in each Function
public static int forLoop(int a)
{
    for(int i=0;i<a;i++)
    {
        System.out.println("i=="+i);
    }
    return a;
}

public static int whileLoop(int b)
{   
    int count = 0;
    while(count < b)
    {
        System.out.println("count=="+count);
        count++;
    }
    return b;

}



}

