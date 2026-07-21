/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int s = 0;
        int e = n;
       
        while(s<=e){
            int mid = s +(e-s)/2;

            // guess ek method hai jo call krna padega  
            //phele condition is num == to the computer is return the num , 0 means the computer guess and my guess ar equal
            if(guess(mid) == 0){
                return mid ;  
            }

            // if mera num less then aata hai computer ke num se toh mujhe right side jana hoga simple sa bs 
            // yaha 1 is equal to the lower no. which we guess usse chota number 
            else if(guess(mid)==1){
                
               s = mid+1;

            }
            // -1 means humara num is greater then the computer vala no.
            // so mujhe left me jake dekhna padega 
            else {
                //guess(mid)==-1)
              e = mid-1;
            
            }

        }
        return -1;
    }
}