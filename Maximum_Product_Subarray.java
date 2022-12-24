/*Given an integer array nums, find a 
subarray
 that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.*/


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
  
