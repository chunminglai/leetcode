public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
    int[][] col = new int[9][9];
    int[][][] bb = new int[3][3][9];

    for(int i = 0; i<9; i++){//row
        for(int j = 0; j<9; j++){//col
            if(board[i][j]=='.'){
                continue;
            }
            else{
                int index = board[i][j] - '0' - 1;
                row[i][index]+=1;
                if(row[i][index]>1) return false;
                col[j][index]+=1;
                if(col[j][index]>1) return false;
                bb[i/3][j/3][index]+=1;
                if(bb[i/3][j/3][index]>1) return false;
            }
        }
    }
    return true;
    }
}
