package revision;

import java.util.ArrayList;

/**Do You know this ?
 * 1 Java data type
 * 2 Java Variables
 * 3 Constructor
 * 4 Method
 * 5 Object Creation
 * 6 Inheritance (Automation)
 * 7 Polimorphysm (Automation)
 * 8 Abstraction
 * 9 Encapsultion (API Testing)
 * 10 Class
 * 11 Object
 * 12 Collection
 * (ArrayList is Important in Automaiton and API)
 * (HasMap is Important in Automaiton and API)
 * (Set is Important in Automaiton and API)
 */
public class JavaRevision {
    String name;
    int value;
    public JavaRevision() {
    }
    public JavaRevision(String name, int value) {
        this.name = name;
        this.value = value;
    }
    public void printName(){
        System.out.println("My name is " + name);
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        JavaRevision javaRevision = new JavaRevision();
        javaRevision.printName();
        JavaRevision obj1 = new JavaRevision("Prime", 102);
        obj1.printName();
      //  JavaRevision obj2 = new JavaRevision(("Testiestion" ,  103);
     //   String name = obj2.getName();
        System.out.println();
        JavaRevision javaRevision1 = obj1.getInstance();
    }

    public JavaRevision getInstance(){
        JavaRevision javaRevision = new JavaRevision();
        return javaRevision;
    }
    public void getList(){
        ArrayList<String> list = new ArrayList<>();
      //  return list;
    }
}
