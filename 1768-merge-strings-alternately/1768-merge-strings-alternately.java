class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder mergeArray = new StringBuilder();
        while(i < word1.length() || i < word2.length()) {
            if(i < word1.length()) {
                mergeArray.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                mergeArray.append(word2.charAt(i));
            }
            i++;
        }
        return mergeArray.toString();
    }
}