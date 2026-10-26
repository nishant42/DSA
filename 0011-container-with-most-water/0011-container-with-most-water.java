class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right= height.length-1;
       int max=0;
       int area=0;
       while(left<right){
        if(height[left]<height[right]){
            area= (right-left)* height[left];
            max=Math.max(area,max);
            left+=1;
        }
        else{
            area=(right-left)*height[right];
             max=Math.max(area,max);
            right-=1;
        }

       }
    return max;
    }
}