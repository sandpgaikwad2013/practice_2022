package sandeep.code.base;
//given an array calculate the sum of elements between given indexes
public class addSubArray {

    public static void main(String[] args) {
        int[] a={2,4,6,8,6,9};//
        int s=1;
        int e=3;
        int count =0;
        for (int i=s;i<=e;i++){
           // if(i>=s && i<=e)
            {
                count=count+a[i];
            }
        }
        System.out.println(count);
    }





}
