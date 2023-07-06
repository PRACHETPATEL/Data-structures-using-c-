package DAA;

import java.util.Arrays;
import java.util.Random;
public class InsertionSort {
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void insert(int[] arr,int insert) {
        int max = 0, index = 0;
        for (int i = insert; i >0; i--) {
            if (arr[i] < arr[i-1]) {
                swap(arr,i,i-1);
            }
            else return;
        }
    }
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insert(arr,i);
        }
    }
    static void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int n=10000;
        int[] arr2 = new int[n];
        int[] arr1 = new int[n];
        int[] arr3 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = i;
            arr2[i] = n - i;
            Random random = new Random();
            arr3[i] = random.nextInt(n) + 1;
        }
        System.out.println("Array Best Case:");
        System.out.println("Array before sorting : ");
        display(arr1);
        long startTime=System.nanoTime();
        sort(arr1);
        long TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(arr1);
        System.out.println("Time Taken to sorting array of length "+n+" ascending is "+TimeTaken+" ms");
        System.out.println("Array Average Case:");
        System.out.println("Array Before sorting : ");
        display(arr3);
        startTime=System.nanoTime();
        sort(arr3);
        TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(arr3);
        System.out.println("Time Taken to sorting array of length "+n+" ascending is "+TimeTaken+" ms");
        System.out.println("Array worst Case:");
        System.out.println("Array before sorting : ");
        display(arr2);
        startTime=System.nanoTime();
        sort(arr2);
        TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(arr2);
        System.out.println("Time Taken to sorting array of length "+n+" ascending is "+TimeTaken+" ms");
    }
}
