class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0

        # Store numbers in a HashSet for O(1) lookup
        num_set = set(nums)
        longest_sequence = 0

        # Iterate through each number
        for num in num_set:
            # Only start counting if `num` is the start of a sequence
            if num - 1 not in num_set:
                current_num = num
                current_length = 1

                # Count the length of the sequence
                while current_num + 1 in num_set:
                    current_num += 1
                    current_length += 1

                # Update the longest sequence found
                longest_sequence = max(longest_sequence, current_length)

        return longest_sequence




