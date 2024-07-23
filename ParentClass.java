public class ParentClass {
    public String getName(String name) {
        return name;
    }
  
    public static void main(String[] args) {
        ParentClass pc = new ParentClass();
        String name = "Karthik";
        System.out.println(" Name: " + pc.getName(name));
    }
}
