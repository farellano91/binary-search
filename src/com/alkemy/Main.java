package com.alkemy;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        int[] array1 = { 2, 3, 4, 10, 15, 40 };

        int[] array2 = { 2, 5, 8, 10, 25, 30, 38 };

        System.out.println("Array = " + Arrays.toString(array1) + ", target value = 15");
        System.out.println("Binary Search Result = " + BinarySearch.search(array1, 15));

        System.out.println();

        System.out.println("Array = " + Arrays.toString(array2) + ", target value = 60");
        System.out.println("Binary Search Result = " + BinarySearch.search(array2, 60));

    }

}
