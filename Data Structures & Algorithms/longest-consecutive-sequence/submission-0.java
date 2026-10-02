class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int ans = 0;

        for (int n : set) {

            // Start only if n is the beginning of a sequence
            if (!set.contains(n - 1)) {

                int current = n;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                ans = Math.max(ans, length);
            }
        }

        return ans;
    }
}
