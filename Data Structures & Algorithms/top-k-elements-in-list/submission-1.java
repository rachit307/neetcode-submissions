class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            maxFreq = Math.max(map.get(n), maxFreq);
        }
        List<Integer>[] buckets = new List[maxFreq + 1];
        for (int n : map.keySet()) {
            int freq = map.get(n);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(n);
        }
        int[] result = new int[k];
        int index = 0;

        for (int freq = maxFreq; freq >= 1 && index < k; freq--) {
            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    result[index++] = num;
                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
