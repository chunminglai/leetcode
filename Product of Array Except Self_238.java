public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int k=1;
        for(int i=0;i<n;i++){
            res[i] = k;
            k = k*nums[i];
        }
        int k2=1;
        for(int i=n-1;i>=0;i--){
            res[i] *=k2;
            k2 *=nums[i];
        }
        return res;
    }
}
