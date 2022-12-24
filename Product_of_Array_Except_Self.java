/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lft[]=new int[nums.length];
        int rght[]=new int[nums.length];
        int ans[]=new int[nums.length];
        int prod=1,i;
        lft[0]=1;
       for(i=1;i<nums.length;i++)
       {
           lft[i]=lft[i-1]*nums[i-1];
       }
       rght[nums.length-1]=1;
       for(i=nums.length-2;i>=0;i--)
       {
           rght[i]=rght[i+1]*nums[i+1];
       }
       for(i=0;i<nums.length;i++)
       {
           ans[i]=lft[i]*rght[i];
       }
       return ans;
        
    }
}
