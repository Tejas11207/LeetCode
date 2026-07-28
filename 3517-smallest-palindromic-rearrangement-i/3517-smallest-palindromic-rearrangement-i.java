// class Solution {
//     public String smallestPalindrome(String s) {

//         int n= s.size();
//         int  count[26] = {0};
    
//         for(int i =0;i<n/2,i++){
//             count[s[i]-'a']++;

//         }
//         int index=0;
//         for(int i=0;i<26;i++){
//             while(count[i]-- >0){
//                 s[index++]=(char)(i+'a');

              

//             }
//             for(int i =0 ;i<n/2;i++){
//                 s[n-1-i] = s[i];

//             }


//         }
//         return s;
//     }
// }


class Solution {
    public String smallestPalindrome(String s) {

        int n = s.length();
        int[] count = new int[26];

        // Count characters in the first half
        for (int i = 0; i < n / 2; i++) {
            count[s.charAt(i) - 'a']++;
        }

        char[] ans = s.toCharArray();

        int index = 0;

        // Arrange first half in lexicographical order
        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                ans[index++] = (char) (i + 'a');
            }
        }

        // Mirror first half to second half
        for (int i = 0; i < n / 2; i++) {
            ans[n - 1 - i] = ans[i];
        }

        return new String(ans);
    }
}