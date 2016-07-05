public class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        
        boolean[] cols = new boolean[n];
        boolean[] id1 = new boolean[2*n];
        boolean[] id2 =new boolean[2*n];
        //default boolean variable is FALSE
        backtrack(0, cols, id1, id2, n);
        return count;
    }
    private void backtrack(int row, boolean[] cols, boolean[] id1, boolean[] id2, int n){
        if(row==n)
            count++;
        for(int col=0;col<n;col++){
            int i1 = col + row;
            int i2 = col - row + n;
            if(cols[col] || id1[i1] || id2[i2]){
                continue; //已經被放過queen了 不放
            }
            //不然就是沒放過，可放
            cols[col] = true; id1[i1] = true; id2[i2] = true;
            backtrack(row+1, cols, id1, id2, n);
            cols[col] = false; id1[i1] = false; id2[i2] = false;
        }
    }
}
