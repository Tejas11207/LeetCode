class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()){
            return false;

        }
        return (s+s) .contains(goal);
        // concatenated stirng s + s  
        //For example, if s = "abcde", then s + s = "abcdeabcde"
        // contains all rotations: "abcde", "bcdea", "cdeab", "deabc", "eabcd".

//   first, check if lengths are equal (if not, rotation is impossible)
    // Create a concatenated string s + s which contains all possible rotations
// Check if goal is a substring of s + s
// s = "abcde", goal = "cdeab"
// s + s = "abcdeabcde"
// "cdeab" is present in "abcdeabcde", so return True
 

    }
}