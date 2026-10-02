class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0;
        int product = 1;
        int productWithoutZero = 1;
        for (int n : nums) {
            product = product * n;
            if (n == 0) {
                zeros += 1;
            } else {
                productWithoutZero = productWithoutZero * n;
            }
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {

                if (zeros > 1) {
                    res[i] = 0;
                }
                else {
                res[i] = productWithoutZero;
                }
            } else {
                res[i] = product / nums[i];
            }
        }
        return res;
    }
}
