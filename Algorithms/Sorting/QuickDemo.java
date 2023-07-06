package com.mycompany.mavenproject1;
import java.util.Arrays;
import java.util.Random;
public class QuickDemo {
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void quicksort(int[] arr,int l,int r) {
        int start=l;
        int end=r;
        int mid=(start+end)/2;
        int pivote=arr[mid];
        if(l>r){
            return;
        }
        while (start<=end){
            while(pivote>arr[start]){
                start++;
            }
            while(pivote<arr[end]) {
                end--;
            }
            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        quicksort(arr,l,end);
        quicksort(arr,start,r);
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
            array2[i] = size - i - 1;
            Random random = new Random();
            array3[i] = random.nextInt(size) + 1;
        }
        System.out.println("Quick Sort");
        System.out.println("Best Case:");
        System.out.println("Array before sorting : ");
        display(array1);
        long startTime=System.nanoTime();
        quicksort(array1,0,array1.length-1);
        long TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(array1);
        System.out.println("Time Taken for sorting array of length "+size+" ascending is "+TimeTaken+" ms");
        System.out.println("---------------------");
        System.out.println("Average Case:");
        System.out.println("Array Before sorting : ");
        display(array3);
        startTime=System.nanoTime();
        quicksort(array3,0,array3.length-1);
        TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(array3);
        System.out.println("Time Taken for sorting array of length "+size+" ascending is "+TimeTaken+" ms");
        System.out.println("---------------------");
        System.out.println("worst Case:");
        System.out.println("Array before sorting : ");
        display(array2);
        startTime=System.nanoTime();
        quicksort(array2,0,array2.length-1);
        TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(array2);
        System.out.println("Time Taken for sorting array of length "+size+" ascending is "+TimeTaken+" ms");
        System.out.println("---------------------");
    }
}