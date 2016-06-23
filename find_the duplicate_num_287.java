import java.util.*;
public class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length;

        int midcount;
        

        while(low<high) {
            midcount=0;
            int leftcount=0;
            int rightcount=0;
            int mid = low+(high-low)/2;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == mid)
                    midcount++;
                else if (nums[i] > mid && nums[i] <high) {
                    rightcount++;
                } else if(nums[i] < mid && nums[i] >=low)
                    leftcount++;
            }
            if(midcount>1){
                return mid;
            }
            if(leftcount>(mid - low))
                high = mid;
            else if(rightcount>(high-mid-1))
                low = mid+1;
        }
        return low;
    }
}
