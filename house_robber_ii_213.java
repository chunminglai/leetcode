public class Solution {
    public int startfrom(int[] nums, int k) {
        int n = nums.length;
        int dp[] = new int[n];
        if(k==0){
            n=n-1;
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0],nums[1]);
        }
        if(k==1){
            dp[1] = nums[1];
            dp[2] = Math.max(nums[1],nums[2]);
        }
        for(int i=2+k;i<n;i++){
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]); 
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0], nums[1]);
        if(nums.length==3 && nums[0]==nums[1] &&nums[0]==nums[2]&&nums[1]==nums[2])
            return nums[0];
            
        //int dp[] = new int[nums.length];
        int start0 = startfrom(nums,0);
        int start1 = startfrom(nums,1);
        return Math.max(start0, start1);
        
    }
    
}
