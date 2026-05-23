class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        // Calculate frequency
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // Convert to array list and sort
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];

        for(int i=0; i<k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}
