package com.ajay;

public class BInarySearch
{
    public static void main(String[] args) {
        int[] nums={2,3,6,7,13,13,16,21,28,67,97};
        int target=13;
        int ans=binarysearch(nums,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {

            int mid=start+(end-start)/2;
            int midnum=nums[mid];
            if(target==midnum){
                return mid;
            }
            else if(target>midnum){
                start=mid+1;
            }
            else{
                end=mid-1;
            }


        }
        return -1;

    }

}
