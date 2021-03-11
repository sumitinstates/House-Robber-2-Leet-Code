package com.sumit;

public class Solution {
	    
	    public static int rob(int[] nums) {
	        
	        if(nums==null){
	            return 0;
	        }
	        
	        if(nums.length ==1 ){
	            return nums[0];
	        }
	        
	        if(nums.length==2){
	            return Math.max(nums[0],nums[1]);
	        }
	        
	        int n = nums.length;
	        int a = solve(nums,0,n-2);
	        int b = solve(nums,1,n-1);
	        return Math.max(a,b);
	        
	        
	    }
	    
	    private static int solve(int[]nums, int st, int end){
	        
	        int len = end-st+1;
	        
	        int[] dp = new int[len];
	        dp[0]=nums[st];
	        dp[1] = Math.max(nums[st],nums[st+1]);
	        
	        for(int i=st+2;i<=end;i++)
	        {
	            dp[i-st] = Math.max(nums[i]+dp[i-st-2],dp[i-st-1]);
	        }
	        
	        return dp[end-st];
	    } 

    
    public static void main(String[] args) {
    	
    	int [] arr1 = {1,2,3,1};
    	int[] arr2 = {1,2,1,1};
    	
    	System.out.println(Solution.rob(arr1));
    	System.out.println(Solution.rob(arr2));
		
	}

}
