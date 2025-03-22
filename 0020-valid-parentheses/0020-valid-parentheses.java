class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> bracketMap = Map.of(
    ')', '(', 
    '}', '{', 
    ']', '['
);
Set<Character> openBrackets = Set.of('(', '{', '[');
Stack<Character> mystack= new Stack<>();
for (char ch : s.toCharArray()) {
if(openBrackets.contains(ch))
{
    mystack.push(ch);
}
else if(bracketMap.containsKey(ch)){
    if(mystack.isEmpty()||mystack.pop()!=bracketMap.get(ch)){
return false;
    }

}

}
return mystack.isEmpty();
}}