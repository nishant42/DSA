class Solution {
public:
    bool isPalindrome(int x) {
        if (x<0 || (x%10==0 && x!=0)){
            return false;
        }
        int reverse=0;
        int original=x;
        while(original>reverse){
            reverse=reverse*10+original%10;
            original=original/10;
        }
        return original==reverse||original==reverse/10;
        
    }
};