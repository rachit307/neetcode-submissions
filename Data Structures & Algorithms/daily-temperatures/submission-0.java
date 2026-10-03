class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.isEmpty()) {
                s.add(i);
            } else {
                while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                    int idx = s.pop();
                    res[idx] = i - idx;
                }
                s.push(i);
            }
        }
        return res;
    }
}
