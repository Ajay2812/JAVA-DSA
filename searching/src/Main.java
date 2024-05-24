// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums={2,34,12,23,36,75};
        int target=5;
        int ans=linearsearch(nums,target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int ele=arr[i];
            if(target==ele){
                return i;
            }

        }
        return -1;
    }
}