import java.util.*;
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            path.add(candidates[i]); //choose candidates[i]
            combination(candidates, target-candidates[i], i, path, ans);
            path.remove(path.size()-1);
        }
    }
}
