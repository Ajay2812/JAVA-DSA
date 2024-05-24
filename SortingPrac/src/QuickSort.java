import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int l,int h) {
        if(l>=h){
            return;
        }
        int s=l;
        int e=h;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        while(s<=e) {
            while(arr[s]<pivot){
                s++;
            }
            while(pivot<arr[e]){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
            }
        }
        sort(arr,l,e);
        sort(arr,s,h);
    }
}
