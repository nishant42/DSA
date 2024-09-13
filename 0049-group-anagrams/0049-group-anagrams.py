class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mydict={}
        for ele in strs:
            if "".join(sorted(ele)) in mydict:
                mydict["".join(sorted(ele))].append(ele)
            else:
                mydict["".join(sorted(ele))]=[ele]
        return list(mydict.values())        
        
        
        
        
        
        
        
        
        """
        1.create a dictionary
        2.create a loop and check if the sorted str in that dict if not then add
        3.print the values of the dictionary
        
        
        """
        