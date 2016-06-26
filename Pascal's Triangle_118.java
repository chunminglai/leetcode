import java.util.*;
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new LinkedList<List<Integer>>();
        //LinkedList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new LinkedList<Integer>();
            long curr = 1;
            row.add((int)curr);
            for(int j =1; j<=i;j++){
                curr = curr * (i - j + 1) / j;
                row.add((int) curr);
            }
            pascal.add(row);
        }
        return pascal;
    }
}
