public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[0] + nums[1] +nums[2];
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int s = i+1;
            int t = n-1;
            while(s<t){
                int threesum = nums[i] + nums[s] + nums[t];
                
                if(threesum == target)
                    return target;
                if (Math.abs(threesum - target) < Math.abs(ans - target))
                    ans = threesum;
                if(threesum < target)
                    s++;
                if(threesum > target)
                    t--;
                
            }
            
        }
        return ans;
    }
}
