package com.alkemy;

public class BinarySearch {

    public static int search(int[] array, int value) {

        int start = 0;
        int end = array.length - 1;

        while(start <= end) {

            int middle = start + (end - start) / 2;

            if(array[middle] == value) {

                return middle;

            }

            else if(array[middle] < value) {

                start = middle + 1;

            }

            else {

                end = middle - 1;

            }

        }

        return -1;

    }

}
