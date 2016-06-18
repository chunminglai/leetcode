public class Solution {
    public void moveZeroes(int[] nums) {
        int zero_cnt = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0)
                    zero_cnt ++;
                else if(zero_cnt>0){
                    nums[i-zero_cnt] = nums[i];
                    nums[i]=0;
                }
            }
    }
}
