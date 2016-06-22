import java.util.*;
public class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int curr_sum=nums[0];
        int max_sum=nums[0];
        for(int i=1;i<n;i++){
            if (curr_sum >=0)
                curr_sum +=nums[i];
            else{
                curr_sum = nums[i];
            }
            max_sum = max_sum > curr_sum ? max_sum : curr_sum;
        }
        return max_sum;
    }
}
