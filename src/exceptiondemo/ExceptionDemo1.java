package exceptiondemo;

public class ExceptionDemo1 {
            public static void division() throws ArithmeticException {
            int a = 10;
            int b = 0;
                System.out.println(a / b);
                System.out.println("Hi");
            System.out.println("Hi");
        }
        public static void calculation() throws  ArithmeticException{
                try {
                    calculation();
                } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        public static void main(String[] args) {
            division();
        }
    }
