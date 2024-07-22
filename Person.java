public class Person{
  // Take 4 Variables and Initialize them
  // Create Getters and Setters
  // Create Constructors
  String myname;
  String myaddress;
  int myage;
  int myphoneno;
  //constructor//
  public Person(String myname,String myaddress,int myage,int myphoneno){
    this.myname=myname;
    this.myaddress=myaddress;
    this.myage=myage;
    this.myphoneno=myphoneno;
  }
  public String getMyname() {
    return myname;
  }
  public void setMyname(String myname) {
    this.myname = myname;
  }
  public String getMyaddress() {
    return myaddress;
  }
  public void setMyaddress(String myaddress) {
    this.myaddress = myaddress;
  }
  public int getMyage() {
    return myage;
  }
  public void setMyage(int myage) {
    this.myage = myage;
  }
  public int getMyphoneno() {
    return myphoneno;
  }
  public void setMyphoneno(int myphoneno) {
    this.myphoneno = myphoneno;
  }
  

}
