class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> ngeMap = new HashMap<>();
        Stack<Integer> mono = new Stack<>();
         for (int i : nums2) {
            while (!mono.isEmpty() && mono.peek() < i) {
                ngeMap.put(mono.pop(), i);
            }
            mono.push(i);
        }
 while (!mono.isEmpty()) {
            ngeMap.put(mono.pop(), -1);
        }

        // Step 2: Build the result for nums1 based on the precomputed map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = ngeMap.get(nums1[i]);
        }
        
        return result;
        
    }
}