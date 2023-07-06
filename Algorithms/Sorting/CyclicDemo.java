import java.util.Arrays;
import java.util.Random;

public class CyclicDemo {
    public static void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void fastestsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(i!=correct){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int size=1000000;
        int[] array2 = new int[size];
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = i;
            array2[i] = (size-1)- i;
        }
        System.out.println("Cyclic Sort");
        System.out.println("Array Best Case:");
        System.out.println("Array before sorting : ");
        display(array1);
        long startTime=System.nanoTime();
        fastestsort(array1);
        long TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(array1);
        System.out.println("Time Taken to sorting array of length "+size+" ascending is "+TimeTaken+" ms");
        System.out.println("---------------------");
        System.out.println("Array worst Case:");
        System.out.println("Array before sorting : ");
        display(array2);
        startTime=System.nanoTime();
        fastestsort(array2);
        TimeTaken=(System.nanoTime()-startTime)/1000000;
        System.out.println("Array After Sorting: ");
        display(array2);
        System.out.println("Time Taken to sorting array of length "+size+" ascending is "+TimeTaken+" ms");
        System.out.println("---------------------");
    }
}