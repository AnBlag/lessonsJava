package com.company;

import java.util.ArrayList;

public class arrayFilter {
    public static void main(String[] args) {

        insertionSortAndArrayFilter();

    }
    public static void insertionSortAndArrayFilter () {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {

            int min = array[i];
            int min_i = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (i == 0) {
                list.add(temp);
            } else if (temp == array[i - 1]) {

            } else list.add(array[i]);
        }
        System.out.println(list);
    }
}
