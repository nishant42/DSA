class Solution:
    def longestPalindrome(self, s: str) -> str:
        if not s or len(s) == 1:
            return s

        start = 0
        max_len = 1

        def my_exp(left, right, start_maxlen):
            st_id, max_length = start_maxlen
            while left >= 0 and right < len(s) and s[left] == s[right]:
                current_len = right - left + 1
                if current_len > max_length:
                    st_id = left
                    max_length = current_len
                left -= 1
                right += 1
            return st_id, max_length

        for i in range(len(s)):
            start, max_len = my_exp(i, i, (start, max_len))
            start, max_len = my_exp(i, i + 1, (start, max_len))

        return s[start:start + max_len]
