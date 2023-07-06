package com.mycompany.mavenproject1;
import java.util.Arrays;
import java.util.Random;
public class SelectionDemo {
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int getMaxindex(int[] arr, int x) {
        int max = 0, index = 0;
        for (int i = 0; i < arr.length - x; i++) {
            if (arr[i] > max) {
                index = i;
                max = arr[i];
            }
        }
        return index;
    }
    static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = getMaxindex(arr, i);
            swap(arr, max, arr.length - i - 1);
        }
    }
    static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int size=10000;
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] array3 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = i;
            array2[i] = size - i;
            Random random = new Random();
            array3[i] = random.nextInt(size) + 1;
        }

        System.out.println("Selection Sort");
        System.out.println("Best Case:");
        System.out.println("Array before sorting : ");
        display(array1);
        long startTime=System.nanoTime();
        selectionsort(array1);
        long TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(array1);
        System.out.println("Time Taken for sorting array of length "+size+" ascending is "+TimeTaken+" ms");
        System.out.println("---------------------");
        System.out.println("Average Case:");
        System.out.println("Array Before sorting : ");
        display(array3);
        startTime=System.nanoTime();
        selectionsort(array3);
        TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(array3);
        System.out.println("Time Taken for sorting array of length "+size+" ascending is "+TimeTaken+" ms");
        System.out.println("---------------------");
        System.out.println("worst Case:");
        System.out.println("Array before sorting : ");
        display(array2);
        startTime=System.nanoTime();
        selectionsort(array2);
        TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(array2);
        System.out.println("Time Taken for sorting array of length "+size+" ascending is "+TimeTaken+" ms");
        System.out.println("---------------------");
    }
}
