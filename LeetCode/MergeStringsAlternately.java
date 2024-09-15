class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder new_word = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            new_word.append(word1.charAt(i++));
            new_word.append(word2.charAt(j++));
        }

        while (i < word1.length()) {
            new_word.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            new_word.append(word2.charAt(j++));
        }

        return new_word.toString();
    }
}