class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int temp = target-nums[i];
            if(map.get(temp)!=null)
            {
                return new int[]{map.get(temp),i};
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
