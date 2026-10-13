class Solution {
    public String decodeString(String s) {

        // stack create kro 
        Deque<Integer> countStack= new ArrayDeque<>();

        Deque<StringBuilder> stringStack = new ArrayDeque<>();

        int number = 0; // number valrible 


        StringBuilder curr=new StringBuilder();   // stringBuilde for stringKodallne ke liye 



        for(char ch : s.toCharArray()){

            //case 1 ;

            // if koi bhi string ke aander char hain voh digit hain toh 
            if(Character.isDigit(ch)){
                number = number*10 +(ch-'0');

            }
            // opening bracket se pehle 

            else if (ch == '['){
                // case 2 ;
                countStack.push(number);  // number and curr ko dono ko push kro 

                stringStack.push(curr);

                // now values se initalise 
                //firse  number 0 zero kro 

                number = 0;

                // and current element se new string builder init kro
                curr = new StringBuilder();


            }

            /// closing bracket 
            else if(ch ==']'){
                //case 3 ;
                int repeatCount = countStack.pop();  // bahar nikal do 

                StringBuilder prev = stringStack.pop();

                // ab hun prev ne reapeat count times curr ko append klrne vale hai 
                for(int i =1 ;i<=repeatCount;i++){
                    prev.append(curr);   // repet count ke his sab se append kro 

                }

                // subse important line 
                curr = prev ;  // jo mere prev string hain curr me daal do 

            }

            else {
                // case 4 -> ch -> alphabet string
                curr.append(ch);   // append kro do

            }
        }

        return curr.toString(); 

        
    }
}