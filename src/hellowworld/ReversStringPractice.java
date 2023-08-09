package hellowworld;

import java.util.Scanner;

public class ReversStringPractice {


        public static void main(String[] args)
        {
            Scanner v1 = new Scanner(System.in);
            System.out.println("Enter Your line");
            

            String input = "Geeks for Geeks";

            StringBuilder input1 = new StringBuilder();

            // append a string into StringBuilder input1
            input1.append(input);

            // reverse StringBuilder input1
            input1.reverse();

            // print reversed String
            System.out.println(input1);
        }
    }


