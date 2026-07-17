// Last updated: 7/17/2026, 3:16:30 PM
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();

        backtrack(s, 0, 0, new StringBuilder(), result);

        return result;
    }

    private void backtrack(String s, int index, int parts,
                           StringBuilder current,
                           List<String> result) {

        if (parts == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1));
            return;
        }

        if (parts == 4 || index == s.length()) return;

        for (int len = 1; len <= 3; len++) {
            if (index + len > s.length()) break;

            String part = s.substring(index, index + len);

            if (part.length() > 1 && part.charAt(0) == '0') continue;
            if (Integer.parseInt(part) > 255) continue;

            int beforeLength = current.length();
            current.append(part).append(".");

            backtrack(s, index + len, parts + 1, current, result);

            current.setLength(beforeLength);
        }
    }
}