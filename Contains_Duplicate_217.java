public class Solution {
    public boolean containsDuplicate(int[] nums) {/*
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i]))
                return true;
            hash.put(nums[i], i);
        
        }
        return false;
        */
        if (nums.length==1)
            return false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]^nums[i+1])==0)
                return true;
            
        }
        return false;
        
    }
}
