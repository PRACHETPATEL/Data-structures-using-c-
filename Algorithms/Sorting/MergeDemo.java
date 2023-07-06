package com.mycompany.mavenproject1;

import java.util.Arrays;
import java.util.Random;

public class MergeDemo {
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

        System.out.println("Merge Sort");
        System.out.println("Best Case:");
        System.out.println("Array before sorting : ");
        display(array1);
        long startTime=System.nanoTime();
        array1=mergesort(array1);
        long TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(array1);
        System.out.println("Time Taken for sorting array of length "+size+" ascending is "+TimeTaken+" ms");
        System.out.println("---------------------");
        System.out.println("Average Case:");
        System.out.println("Array Before sorting : ");
        display(array3);
        startTime=System.nanoTime();
        array3=mergesort(array3);
        TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(array3);
        System.out.println("Time Taken for sorting array of length "+size+" ascending is "+TimeTaken+" ms");
        System.out.println("---------------------");
        System.out.println("worst Case:");
        System.out.println("Array before sorting : ");
        display(array2);
        startTime=System.nanoTime();
        array2=mergesort(array2);
        TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(array2);
        System.out.println("Time Taken for sorting array of length "+size+" ascending is "+TimeTaken+" ms");
        System.out.println("---------------------");
    }
    public static int[] mergesort(int[] array){
        if(array.length==1){
            return array;
        }
        int mid=array.length/2;
        int[] left=mergesort(Arrays.copyOfRange(array,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(array,mid,array.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i=0;
        int j=0;
        int k=0;
        int ans[]=new int[left.length+right.length];
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }
            else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }
    public static void display(int[] array){
        System.out.println(Arrays.toString(array));
    }
}