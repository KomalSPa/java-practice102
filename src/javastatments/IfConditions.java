package javastatments;
import java.util.Scanner;
public class IfConditions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        isEligibleForVOte(age);
    }

    public static void isEligibleForVOte(int age) {
        if (age >= 18) {
            System.out.println("Eligible for vote");
        }
        System.out.println("Hello");
    }
}
