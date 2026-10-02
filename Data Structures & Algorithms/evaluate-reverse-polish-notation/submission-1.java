class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for (String str : tokens) {
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                int x = Integer.parseInt(s.pop());
                int y = Integer.parseInt(s.pop());
                int ans;

                if (str.equals("+")) {
                    ans =  (x + y);
                } else if (str.equals("-")) {
                    ans =  (y - x);
                } else if (str.equals("*")) {
                    ans =  (x * y);
                } else {
                    ans =  (y / x);
                }
                s.push(String.valueOf(ans));
            }
            else {
                s.add(str);
            }
        }
        return Integer.parseInt(s.pop());
    }
}
