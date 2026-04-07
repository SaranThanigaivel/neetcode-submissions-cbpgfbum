class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fMap = new TreeMap<>();

        for(int num : nums) {
            fMap.put(num, fMap.getOrDefault(num, 0) +2) ;
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> fMap.get(a) - fMap.get(b)
        );

        for(int key : fMap.keySet()) {
            heap.add(key);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] res = new int[k];

        for(int i = 0; i < k; i++) {
            res[i] = heap.poll();
        }

        return res;
    }
}
