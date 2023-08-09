package revision;

public class Main extends Employee{

    private final Object companyName;

    public Main(String eName, int eId, String companyName) {
        super(eName, eId);
        this.companyName = companyName;
    }

    public static void main(String[] args) {
        Main main = new Main("Jay", 101, "Prime");
        System.out.println(main.geteName());
       // System.out.println(main.getCompanyName());
    }
}
