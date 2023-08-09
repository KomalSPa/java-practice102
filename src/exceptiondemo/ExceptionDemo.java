package exceptiondemo;

public class ExceptionDemo {
    //final is key word
    //finally is block
    public static void division() {
        int a = 10;
        int b = 02;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("I am in catch block");
        }finally {
            System.out.println("I am in finally block");
        }
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        division();
    }
}
