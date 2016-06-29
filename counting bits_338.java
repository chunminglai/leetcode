public class Solution {
    public int[] countBits(int num) {
        int[] cnt =  new int[num+1];
        cnt[0] = 0;
        if(num==0)
            return cnt;
        int i=1;    
        int step = 1;
        while(i<num+1){
            for(int j=0;j<step;++j){
                cnt[i++] = 1+cnt[j];
                if(i==num+1)
                    break;
            }
            step+=step;
        }

        return cnt;
    }
}
