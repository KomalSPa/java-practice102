package stringexamples;

import java.util.Locale;

public class StringDemo {

    public static void main(String[] args) {
        String s1 = "This is my first string";
        String s2 = "This is my second string";
        String s3 = "";

            int l =s1.length();
        System.out.println(l);
        int l2 =s2.length();
        System.out.println(l2);
        System.out.println(s1.contains("first"));
        System.out.println(s1.contains("first1"));
        System.out.println(s2.contains("Second"));
        System.out.println(s2.contains("second1"));
        System.out.println(s2.toUpperCase());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
        System.out.println(s3.isEmpty());

    }
}
