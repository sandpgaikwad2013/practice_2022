package sandeep.code.base;
//given an array of n elements find out the equilibrium  index element
public class EquilibriumElement {
    public static void main(String[] args) {
        int[] a ={ 1, 2, 3, 2, 1} ; //
           //  i   0  1  2  3  4
           int n=a.length;
           System.out.println(n);
           int i=2;
        System.out.println("i am at 0th position index value i is "+i);
        int leftIndexes_1st=0;
        System.out.println(leftIndexes_1st);
        int leftIndexes_second=i-1;
        System.out.println(leftIndexes_second);
       int val= addArray(a,leftIndexes_1st,leftIndexes_second);
       System.out.println(val);
        int rightSide_1st=i+1;
        System.out.println(rightSide_1st);
        int rightSide_2nd=n-1;
        System.out.println(rightSide_2nd);
        int val2= addArray(a,rightSide_1st,rightSide_2nd);
        System.out.println(val2);




    }

    private static int addArray(int[] a, int leftIndexes_1st, int leftIndexes_second) {
        int sum =0;
        for (int i=leftIndexes_1st ; i<=leftIndexes_second ;i++){
            sum=sum+a[i];

        }
        return sum;
    }
}
