class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count+=1;
            }
        }
        if(count>1){
            return false;
        }
        return true;
    }
}
// Algorithm to solve
// Initialize a count variable as 0.

// Loop through the array:

// Compare each element nums[i] with nums[i+1], and increase count if nums[i] > nums[i+1].

// At the end, compare the last element with the first as well, since rotation wraps around.

// If count <= 1, return true, else false.
// (i + 1) % n ensures the last element compares with the first, i.e., makes it circular. if we don't use it it will throw out of bound error . by doint this 
//  if n=5 then at last index i=4 , i+1 =5 % 5 = 0. which will compare the 
// first index element