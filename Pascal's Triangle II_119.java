public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = null, pre = null;
        for (int i = 0; i <= rowIndex; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(j == 0 || i == j ? 1 : pre.get(j) + pre.get(j-1));
            }
            pre = row;
        }
        return row;
    }
}
