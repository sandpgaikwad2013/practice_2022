package sandeep.code.base;

//given an array count the number of elements which has element which is greater than itself
public class Count {
    public static void main(String[] args) {
        approachOne();
        approachTwo();
    }

    private static void approachTwo() {
        int counter =0;
        int[] a={4,7,2,9};
        for (int i=0;i<a.length ;i++) {
            for (int j:a
                 ) {
                if(a[i]<a[j]){
                    counter++;
                }
            }

        }
        System.out.println(counter);



    }

    private static void approachOne() {
    }
}
