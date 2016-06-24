public class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(x+"");
        return sb.toString().equals(sb.reverse().toString());
    }
}
