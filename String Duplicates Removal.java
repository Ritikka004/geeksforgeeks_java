class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
