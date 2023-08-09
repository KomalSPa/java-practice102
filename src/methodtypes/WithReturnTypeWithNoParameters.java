package methodtypes;

public class WithReturnTypeWithNoParameters {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a);
        int answer = addition();
        System.out.println(answer);
        System.out.println(addition());
    }

        public static int addition(){
            int a = 20;
            int b = 30;
            int ans = a+b;
            return ans;
        }
        public static boolean isRight(){
        boolean a = true;
        boolean b = false;
        return b;
        }
}
