//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 class Solution {
    public int trap(int[] height) {
        int i,j,n=height.length;
        int lft[]=new int[height.length];
        int rght[]=new int[height.length];
        lft[0]=height[0];
        for(i=1;i<n;i++)
        {
              lft[i]=Math.max(lft[i-1],height[i]);
        }
        rght[n-1]=height[n-1];
        for(i=n-2;i>=0;i--)
        {
         rght[i]=Math.max(rght[i+1],height[i]);
        }
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum+=Math.min(rght[i],lft[i])-height[i];
        }
        return sum;
        
    }
}
