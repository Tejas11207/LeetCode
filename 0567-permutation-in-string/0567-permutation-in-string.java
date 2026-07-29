// class Solution {

//         static boolean comparefreq(int[] count1 , int[]count2 )
//         {
//              for(int i =0; i<26 ;i++){
//                 if(count1[i] !=count2[i]){
//                 return false ;

//                  }
//              }  
//              return true ;

//         }





//   public boolean checkInclusion(String s1, String s2)
//    {

//        // algo wise 
//          // basic check ->whether s1 k character are present in s2 or not ;
//         // s1 ka table ready krleete hai 
//          // s2 ki first window ko process krlete hai 
//          // s2 ki remanining window ko process krlete h ;

//         if(s1.length()>s2.length()){
//                 return false;

//             }
//             //s1 ka freq table ;
//             int count1[]=new int [26];
//             for(int i =0;i<26;i++){
//                 char ch = s1.charAt(i);
//                 int index = ch-'a';
//                 count1[index]++;

//             }
//             int i =0;
//             int windowlength=s1.length();
//             int count2[]=new int [26];
//             // first window ka freq table ;
//             for( i =0;i<windowlength;i++){
//                 char ch= s2.charAt(i);
//                 int index= ch-'a';
//                 count2[index]++;

//             }
//             if (comparefreq(count1,count2)==true ){
//                 return true ;

//             }
//             else {
//                 //both freq table are not matching;
//                 //process remaining window;

//                 while(i<s2.length()){
//                     //new window pr move krre ho,toh new character ko freq table me add kro;
//                     char newChar = s2.charAt(i);
//                     int newCharIndex=newChar-'a';
//                     count2[newCharIndex]++;

//                 }
//                 //old character ki entery ko tablee se remove kro ;
//                 int oldCharIndex= i-windowlength;
//                 char oldchar=s2.charAt( oldCharIndex);
//                 int freqTableIndexOfoldChar= oldchar-'a';
//                 count2[freqTableIndexOfoldChar]--;

//                 //aapke pass updated table aagya h new window k liye 
//                 // isko copmare karo s1 k reference table se ;
//                 if(comparefreq(count1,count2))
//                     return true;
//                     //yaha pr main hemesha glti krta hu 
//                 i++;
              
//             }
        
//        return true ;
    
//     }
// }


class Solution {

    static boolean comparefreq(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i])
                return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        int[] count1 = new int[26];

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
        }

        int windowLength = s1.length();
        int[] count2 = new int[26];

        // First window
        int i = 0;
        for (; i < windowLength; i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        if (comparefreq(count1, count2))
            return true;

        // Remaining windows
        while (i < s2.length()) {

            // Add new character
            count2[s2.charAt(i) - 'a']++;

            // Remove old character
            count2[s2.charAt(i - windowLength) - 'a']--;

            if (comparefreq(count1, count2))
                return true;

            i++;
        }

        return false;
    }
}