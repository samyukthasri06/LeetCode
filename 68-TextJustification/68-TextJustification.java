// Last updated: 7/17/2026, 3:17:05 PM
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int len = words[i].length();
            int j = i + 1;

            while (j < words.length && len + 1 + words[j].length() <= maxWidth) {
                len += 1 + words[j].length();
                j++;
            }

            StringBuilder line = new StringBuilder();
            int gaps = j - i - 1;

            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) line.append(" ");
                }
            } else {
                int wordsLen = 0;
                for (int k = i; k < j; k++) wordsLen += words[k].length();

                int spaces = maxWidth - wordsLen;
                int each = spaces / gaps;
                int extra = spaces % gaps;

                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        int spaceCount = each + (extra-- > 0 ? 1 : 0);
                        while (spaceCount-- > 0) line.append(" ");
                    }
                }
            }

            while (line.length() < maxWidth) line.append(" ");
            ans.add(line.toString());
            i = j;
        }

        return ans;
    }
}