package methodtypes;

public class WithReturnTypeWithParameters {

    public static void main(String[] args) {
        WithReturnTypeWithParameters obj = new WithReturnTypeWithParameters();
        int sum = obj.addition(5, 6);
        System.out.println(sum);
        int sum1 = obj.addition(7, 7);
        System.out.println(sum1);
        String myNameResult = obj.myName("Komal S Patel");
        System.out.println(myNameResult);
    }

    public int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    public String myName(String name) {
        return name;

    }

}

