class Solution {
    public String reverseVowels(String s) {

        char[] word = s.toCharArray();

        int st = 0;
        int e = s.length() - 1;

        String vowels = "aeiouAEIOU";

        while (st < e) {

            // move start point until it points to vowel

            while (st < e && vowels.indexOf(word[st]) == -1) {
                st++;

            }

            while (st < e && vowels.indexOf(word[e]) == -1) {
                e--;

            }
            // swap the vowles ;

            char temp = word[st];
            word[st] = word[e];
            word[e] = temp;

            // move the pointer toward each other 

            st++;
            e--;

        }

        String answer = new String(word);
        return answer;

    }
}