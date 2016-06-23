import java.util.*;
public class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            //HashMap<Integer,Integer> map = new HashMap<Integer,Integer>;
            Set<Integer> s = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(i-k>0)
                s.remove(nums[i-k-1]);
            if(s.contains(nums[i]))
                return true;
            s.add(nums[i]);
        }
        return false;
    }
}
