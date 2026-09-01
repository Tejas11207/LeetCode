class Solution {
    public String largestOddNumber(String num) {

            // phele travel krunga pura arrays 
            // piche isliye chalu kiya kyuki mujhe largest odd no. chahiyeee thaaa 
            // thats why and if mera pura no hie odd ho toh mujhe usko bhi toh return krna hai 
        
        for(int i = num.length() -1 ;i>=0;i--){

            //so bss string ke aander loop chaliya 
            if((num.charAt(i))%2 ==1){
                // or substring ko return krdiya 
                return num.substring(0,i+1);

            }
        }
        // if kuch na mile toh empty string return 
        return "";
    }
}