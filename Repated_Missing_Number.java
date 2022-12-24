/* "OVERFLOW"  You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4*/
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int ans[]=new int[2];
        Arrays.sort(A);
        long sum=0,n=A.length;
        int i,ind=1;
        for(i=0;i<n-1;i++)
        {
            if(A[i]==A[i+1])
            {
                sum+=(long)A[i];
                ans[0]=A[i];
                ind=i+1;
                i=i+1;
            }
            else
            {
                sum+=(long)A[i];
            }
        }
        if(ind!=n-1)
        {
            sum+=(long)A[(int)n-1];
        }
      //  System.out.println(sum);
        long actsum=(n*(n+1))/2;
        int res=(int)(actsum-sum);
        ans[1]=res;
        return ans;
    }
        
      
}
