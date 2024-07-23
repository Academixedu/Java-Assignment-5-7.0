public class Person{
  // Take 4 Variables and Initialize them
  public String empName;
  public int empId;
  private int empAge;
  private String empAddress;
  public Person(String empName,int empId,int empAge,String empAddress){
    this.empName=empName;
    this.empId=empId;
    this.empAge=empAge;
    this.empAddress=empAddress;
  }
  // Create Getters and Setters
  
  // Create Constructors

  public String getEmpName() {
    return empName;
  }
  public int getEmpId() {
    return empId;
    
  }
  public void setEmpAge(int empAge) {
    this.empAge = empAge;
  }
  public void setEmpAddress(String empAddress) {
    this.empAddress = empAddress;
  }}

