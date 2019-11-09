package com.company;

import java.util.Iterator;


public class ArrayIterator {


    public static Iterator getIterator(Object[] array) {

        return new Iterator() {

            private int count = array.length;
            private int index = 0;

            public boolean hasNext() {
                return index < count;
            }


            public Object next() {
                if (index < count) {
                    return array[index++];
                } else return null;
            }


        };

    }


}
