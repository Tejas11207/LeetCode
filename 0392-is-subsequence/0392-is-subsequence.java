class Solution {
    public boolean isSubsequence(String s, String t) {
        // two pointer techinquec
       int i=0; // for s string 
      int j =0; //for t string 
      


        // bss array mera outof bound nhi hona chaihe uski condtion
       while(i<s.length() && j<t.length() ){

          //  just check the dono ke characters  equal hai ya nhi hai
            if(s.charAt(i)==t.charAt(j)){
                i++; // if yeh equal nhi hai toh j vala ko aage krneg dono ko side by side compare  kr do 


            }
                // j tb move hoga jb character match hoga
             j++;
            
       }
       //Every time we find a matching character in t, we do:

        return i ==s.length(); 
        // i =3 ;
        //s.length =3 so true ;

        // j and i  simantaniousely aage badhenge ;
    }
}