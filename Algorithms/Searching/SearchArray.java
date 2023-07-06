package DAA;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SearchArray {
    public static int linearsearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int binarysearch(int[] arr,int target){
        int low=0;
        int up=arr.length-1;
        int mid=(up+low)/2;
        while(low<=up){
            if(arr[mid]>target){
                up=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                return mid;
            }
            mid=(up+low)/2;
        }
        return -1;
    }
    public static void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int ans=0,x=0;
        long starttime,endtime,timetaken;
        int[] array1=new int[10000];
        int[] array2=new int[10000];
        Random random=new Random();
        for(int i=0;i<10000;i++){
            array1[i]=random.nextInt(10000)+1;
            array2[i]=i+1;
        }
        System.out.println("Linear Search");
        System.out.println("Array:");
        display(array1);
        System.out.println("Best Case");
        x=array1[0];
        starttime=System.nanoTime();
        ans=linearsearch(array1,x);
        endtime=System.nanoTime();
        timetaken=(endtime-starttime);
        System.out.println(x+" is at "+ans+" index in array");
        System.out.println("Time Taken for searching:"+timetaken+" ns");
        System.out.println("-----------------------------------------");
        System.out.println("Average Case");
        x=array1[5000];
        starttime=System.nanoTime();
        ans=linearsearch(array1,x);
        endtime=System.nanoTime();
        timetaken=(endtime-starttime);
        System.out.println(x+" is at "+ans+" index in array");
        System.out.println("Time Taken for searching:"+timetaken+" ns");
        System.out.println("-----------------------------------------");
        System.out.println("Wrost Case");
        x=-1;
        starttime=System.nanoTime();
        ans=linearsearch(array1,x);
        endtime=System.nanoTime();
        timetaken=(endtime-starttime);
        System.out.println(x+" is at "+ans+" index in array");
        System.out.println("Time Taken for searching:"+timetaken+" ns");
        System.out.println("-------------------------------------------------------------------------"); 
        System.out.println("Binary Search");
        System.out.println("Array:");
        display(array2);
        System.out.println("Best Case");
        x=array2[4999];
        starttime=System.nanoTime();
        ans=binarysearch(array2,x);
        endtime=System.nanoTime();
        timetaken=(endtime-starttime);
        System.out.println(x+" is at "+ans+" index in array");
        System.out.println("Time Taken for searching:"+timetaken+" ns");
        System.out.println("-----------------------------------------");
        System.out.println("Average Case");
        x=array2[1350];
        starttime=System.nanoTime();
        ans=binarysearch(array2,x);
        endtime=System.nanoTime();
        timetaken=(endtime-starttime);
        System.out.println(x+" is at "+ans+" index in array");
        System.out.println("Time Taken for searching:"+timetaken+" ns");
        System.out.println("-----------------------------------------");
        System.out.println("Wrost Case");
        x=1;
        starttime=System.nanoTime();
        ans=binarysearch(array2,x);
        endtime=System.nanoTime();
        timetaken=(endtime-starttime);
        System.out.println(x+" is at "+ans+" index in array");
        System.out.println("Time Taken for searching:"+timetaken+" ns");
        System.out.println("-----------------------------------------");
        
    }
}
