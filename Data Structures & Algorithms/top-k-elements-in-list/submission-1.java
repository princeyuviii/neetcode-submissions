class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequencies
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : freq.keySet()) {

            int count = freq.get(num);

            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }

            bucket[count].add(num);
        }

        // Step 3: Collect top k elements
        int[] ans = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {

                    ans[index++] = num;

                    if (index == k)
                        break;
                }
            }
        }

        return ans;
    }
}