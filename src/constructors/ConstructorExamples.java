package constructors;

public class ConstructorExamples {
    int empID;
    String empName;
    public ConstructorExamples(int empID, String empName){
        this.empID = empID;
        this.empName = empName;
    }
    public static void main (String[] args){
        ConstructorExamples obj = new ConstructorExamples( 10,  "Raju" );
        obj.demo();
        ConstructorExamples obj1 = new ConstructorExamples(100,  "Niraj");
        obj1.demo();

    }
    public void demo() {
        System.out.println(empID);
        System.out.println(empName);
    }
}
