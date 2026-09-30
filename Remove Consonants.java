class Solution {
    String remConsonants(String s) {
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                res.append(ch);
            }
        }
        return res.toString();
    }
};
