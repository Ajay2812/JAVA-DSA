import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={3,4,2,6,7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            swap(a,start,end);
            end--;
            start++;
        }
    }
}
