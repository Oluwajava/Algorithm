package com.company;

import com.sun.deploy.util.ArrayUtil;
import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;

import java.util.Arrays;
import java.util.LinkedList;

public class Rotation {

    public static final int size = 10;

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < size; i++) {
            list.add(new Integer(i));
//            array[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        rotate(list, 3);
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n\n");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        rotate(array, 2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void rotate(LinkedList<Integer> list, int numberOfTimes) {
        if (numberOfTimes > 0) {
            int temp = list.getFirst();
            list.removeFirst();
            list.addLast(new Integer(temp));
            rotate(list, numberOfTimes - 1);
        }
    }

    //another solution for array
    /*
    it's lesser than linear time in a way
    the approach i used is to swap starting from the point equals to
    the number of rotation you want to make

    so if i have an array of 10 and i want to rotate it 3 times it takes
    7 steps to rotate it
     */
    public static void rotate(int[] array, int numberOfTimes) {
        if (numberOfTimes > 0) {
            int counter = 0;
            int middle = numberOfTimes;
            for (int i = numberOfTimes; i < array.length; i++) {
                if (!(i / numberOfTimes >= 2)) {
                    int temp = array[counter];
                    array[counter] = array[i];
                    array[i] = temp;
                    counter++;
                } else {
                    int temp = array[middle];
                    array[middle] = array[i];
                    array[i] = temp;
                    middle++;
                }
            }
        }
    }

 }
