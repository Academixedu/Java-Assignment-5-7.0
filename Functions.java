public class Functions{
  public void pExample()
  {
    System.out.println("it's a java program");// prepare a void function
  }
   public void pExample(String msg )
  {
    System.out.println("it's a "+msg);
  } // prepare a function with parameters 
 public int pExample(int a,int b) {
   int div=a/b;
   System.out.println("Division="+div);
   return div;
 } 
 // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public static void main(String[]args){
  Functions f=new Functions();
  f.pExample();
  f.pExample("Good msg");
  int div=f.pExample(100 , 10);// Call three Functions here
  }
}
