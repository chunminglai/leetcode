import java.util.*;
public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        ArrayList <Integer> path = new ArrayList<Integer>();
        combination(candidates, target, 0, path, ans);
        return ans;
    }
    void combination(int[] candidates, int target, int start, ArrayList<Integer> path, List<List<Integer>> ans){
        if(target==0){
            ArrayList<Integer> p = new ArrayList<Integer>(path);
            ans.add(p);
            return;
        }
        for(int i=start;i<candidates.length && target>=candidates[i];i++){
            //if(i!=start )
              //  continue;
            path.add(candidates[i]); //choose candidates[i]
            combination(candidates, target-candidates[i], i+1 , path, ans);
            path.remove(path.size()-1);
            while (i < candidates.length - 1 && candidates[i] == candidates[i+1]) i++;
            //對每個元素都會做一次
            //所以要避免
        }
    }
}

