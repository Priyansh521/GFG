class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        if (n < 2) {
            return 0; // Not enough elements to form pairs
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int complement = k - arr[i];
            if (frequencyMap.containsKey(complement)) {
                count += frequencyMap.get(complement);
            }

            // Update the frequency of the current element in the map
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
}
