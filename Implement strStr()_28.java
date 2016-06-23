import java.util.*;
public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==0 && needle.length()==0)
            return 0;
        if(needle.length()==0)
            return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String sub = haystack.substring(i,i+needle.length());
                if (sub.equals(needle))
                    return i;
                else
                    continue;
            }
        }
        return -1;
    }
}
