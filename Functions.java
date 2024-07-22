public class Functions{
// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name


  public void funs(){
    System.out.println("void functon");
  }
  public void funs(int age){
    System.out.println("age:" +age);
  }
  public String funs(String sname){
    return sname;
  }
  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here

  f.funs();
  f.funs(18);
  System.out.println("name:"+f.funs("syam"));
  }
}
