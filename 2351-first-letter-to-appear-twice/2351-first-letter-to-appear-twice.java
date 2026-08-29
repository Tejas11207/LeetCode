class Solution {
    public char repeatedCharacter( String s) {


        // create the hash set 
        // hash set me store krunga char
        // then jo bhi pehladupplicate letter mila usko return kr dunga 

        HashSet<Character> set = new HashSet<>();

        // check  every character then in the string 
        // for loop

        for(char ch : s.toCharArray()){

            // if  the char. already exits then return it 

            if(set.contains(ch)){
                return ch;

            }
            // nhi toh hash set me add krte rahooo 

            set.add(ch);

        }

        return ' '; // for safety  mera ye vala code kabhi excute hie nhi hoga if mujhe ans milega toh toh voh pehle hie return hojayega (this only for safety resons because the question have the return type )
        
    }
}