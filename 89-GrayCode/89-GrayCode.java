// Last updated: 7/17/2026, 3:16:35 PM
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();

        int total = 1 << n;

        for (int i = 0; i < total; i++) {
            result.add(i ^ (i >> 1));
        }

        return result;
    }
}