public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) 
            return (new int[0]);
        int n1 = nums1.length;
        int n2 = nums2.length;
        int [] result = new int [Math.min(n1, n2)];
        int i = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (i = 0; i < n1; i++) {
            set.add(nums1[i]);
        }
        int count = 0;
        for (i = 0; i < n2; i++) {
            if (set.contains(nums2[i])){
                result[count++] = nums2[i];
                set.remove(nums2[i]);
        }
    }
    return Arrays.copyOfRange(result, 0, count);
    }
}
