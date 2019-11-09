package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        DeleteDuplicate dd = new DeleteDuplicate();
        List<String> array = new ArrayList<>();
        array.add("Ann");
        array.add("Ann");
        array.add("Olga");

        System.out.println(dd.duplicate(array));

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(dd.duplicate(list));


        Equations equations = new Equations(1,-4,3);
        equations.solution();


        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        Iterator iterator =  ArrayIterator.getIterator(integers);
            while(iterator.hasNext()) {
                 System.out.println(iterator.next());
            }


    }
}
