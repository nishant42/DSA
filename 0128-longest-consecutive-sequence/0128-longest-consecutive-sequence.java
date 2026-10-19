class Solution {
    public int longestConsecutive(int[] nums) {
          Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxval = 0;
         
        for (int i : set) {
			int count=0; 
            long current = i;
            if (!set.contains(i-1)) {
                
                while ( set.contains((int) current)) {
                        count++;
                        current++;
                    }
				
            }

            maxval = Math.max(maxval, count);
        }

        return maxval;
    }
}