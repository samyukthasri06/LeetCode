// Last updated: 7/17/2026, 3:17:16 PM
class Solution {
    public String getPermutation(int n, int k) {

        // Store numbers from 1 to n
        List<Integer> numbers = new ArrayList<>();

        // Factorial of (n-1)
        int fact = 1;

        for (int i = 1; i < n; i++) {
            fact *= i;
            numbers.add(i);
        }

        numbers.add(n);

        // Convert k to 0-based index
        k--;

        StringBuilder ans = new StringBuilder();

        while (true) {

            // Select the digit
            ans.append(numbers.get(k / fact));

            // Remove used digit
            numbers.remove(k / fact);

            // If no numbers left, stop
            if (numbers.size() == 0)
                break;

            // Update k
            k = k % fact;

            
            fact = fact / numbers.size();
        }

        return ans.toString();
    }
}