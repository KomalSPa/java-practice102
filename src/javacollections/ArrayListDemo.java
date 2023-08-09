package javacollections;

import java.util.ArrayList;

public class ArrayListDemo {
    //Array
    int[] a = new int[5];

    public static void main(String[] args) {
        //Array List for generic object
        ArrayList list = new ArrayList();

        // ArrayList list = new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add("50");
        list.add(true);
        list.add('H');
        System.out.println(list.size());
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //remove value from list
        list.remove(2);
        System.out.println("After removing value");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            for (Object name : list) {
                System.out.println(name);

            }
            ArrayList<String> carList = new ArrayList();
            carList.add("Audi");
            carList.add("Hond");
            carList.add(String.valueOf(50));
            ArrayList<Integer> number = new ArrayList();
            number.add(20);
            //number.add(Integer.valueOf("Prime"));


        }
    }}
