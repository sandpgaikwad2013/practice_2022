package scalar;

import java.util.Arrays;

public class RevereTheArray {
    public static void main(String[] args) {
       int[]  a={1,5,8,9};
       System.out.println("before reverse");
       printArray(a);
       int i=0;
       int j=a.length-1;
       while (i<=j){
           swapArray(i,j,a);
           i=i+1;
           j=j-1;
       }
       System.out.println("after reverse");
       printArray(a);





    }

    private static void swapArray(int i, int j, int[] a) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;


    }

    private static void printArray(int[] a) {
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }


}
