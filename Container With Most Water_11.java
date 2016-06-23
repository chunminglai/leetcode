/**
 * Created by chunming on 6/21/16.
 */
import java.util.*;
public class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int n = height.length;
        int j = n-1;
        int ans =0;
        int lh = height[0];
        int rh = height[n-1];
        while(i<j){
            int tmp = Math.min(lh,rh) * (j-i);
            ans = Math.max(ans,tmp);

            if(lh<rh){
                while(i<j && height[i]<=lh)
                    i++;
                if(i<j)
                    lh = height[i];
            }
            else{
                while(j>i && height[j]<=rh)
                    j--;
                if(i<j)
                    rh = height[j];

            }
        }
        return ans;

    }
}
