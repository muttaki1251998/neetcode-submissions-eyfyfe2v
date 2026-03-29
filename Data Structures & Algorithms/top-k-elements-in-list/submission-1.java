class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a,b) -> b.getValue() - a.getValue());

        List<Integer> result = new ArrayList<>();

        for(int i =0; i<k; i++) {
            result.add(entries.get(i).getKey());
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
