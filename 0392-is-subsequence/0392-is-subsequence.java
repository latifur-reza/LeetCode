class Solution {
    public boolean isSubsequence(String s, String t) {
        int x = 0;
        for(int i=0; i<t.length(); i++){
            if(x < s.length() && t.charAt(i) == s.charAt(x)) {
                x++;
            }
        }
        return x == s.length();
    }
}