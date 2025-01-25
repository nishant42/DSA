class Solution:
    def reversePairs(self, nums: List[int]) -> int:
        # Initialize the high index (end of the array)
        high = len(nums)
        # Call the helper function `sortt` to count reverse pairs and sort the array
        return self.sortt(nums, 0, high - 1)
    
    def sortt(self, nums, low, high):
        # Base case: If the subarray has one or no elements, no reverse pairs exist
        if low >= high:
            return 0
        
        # Calculate the middle index to divide the array into two halves
        mid = (low + high) // 2
        
        # Count reverse pairs in the left and right halves recursively
        count = self.sortt(nums, low, mid) + self.sortt(nums, mid + 1, high)
        
        # Count reverse pairs across the two halves
        count += self.reverse_pair(nums, low, mid, high)
        
        # Merge the two sorted halves
        self.merge(nums, low, mid, high)
        
        # Return the total count of reverse pairs
        return count
    
    def merge(self, nums, low, mid, high):
        # Temporary list to hold merged values
        temp = []
        left = low         # Pointer for the left half
        right = mid + 1    # Pointer for the right half
        
        # Merge the two sorted halves
        while left <= mid and right <= high:
            if nums[left] <= nums[right]:
                # Add the smaller element from the left half to temp
                temp.append(nums[left])
                left += 1
            else:
                # Add the smaller element from the right half to temp
                temp.append(nums[right])
                right += 1
        
        # Add remaining elements from the left half (if any)
        while left <= mid:
            temp.append(nums[left])
            left += 1
        
        # Add remaining elements from the right half (if any)
        while right <= high:
            temp.append(nums[right])
            right += 1
        
        # Copy the sorted elements back to the original array
        for i in range(low, high + 1):
            nums[i] = temp[i - low]
    
    def reverse_pair(self, nums, low, mid, high):
        # Count of reverse pairs
        count = 0
        right = mid + 1  # Pointer for the right half
        
        # Iterate through each element in the left half
        for i in range(low, mid + 1):
            # Move the `right` pointer while the condition nums[i] > 2 * nums[right] holds
            while right <= high and nums[i] > 2 * nums[right]:
                right += 1
            
            # The number of valid reverse pairs for nums[i] is the difference
            # between the current `right` pointer and the start of the right half (mid + 1)
            count += right - (mid + 1)
        
        # Return the count of reverse pairs
        return count
