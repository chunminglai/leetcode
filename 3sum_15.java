public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int N = nums.length;
        for(int i=0;i<N-2 && nums[i] <=0;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int two = 0 - nums[i];
            int start=i+1;
            int end=N-1;
            while(start<end){
                if((nums[start]+nums[end]) < two)
                    start++;
                else if((nums[start]+nums[end]) > two)
                    end--;
                else{
                    while (start < end && nums[start] == nums[start+1]) start++;;  // avoid duplicates
                    while (start < end && nums[end] == nums[end-1]) end--;;  // avoid duplicates

                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(nums[i]); tmp.add(nums[start]); tmp.add(nums[end]);
                    res.add(tmp);
                    start++;
                    end--;
                    
                }
            }
        }
        return res;
    }
}
