class Solution {
    public int largestAltitude(int[] gain) {

        int currentAltitude = 0;

        // highest altitude jo mera currently currentaltitude ke equal hoga ;
        int highestAltitude= currentAltitude ;

        for(int altitudegain:gain){
            // gain altitude ko main current altitude me add krunga 
            currentAltitude  +=altitudegain;

            // ab max value niklana hai b/w currentAltitude and highestAltitude mein;

            highestAltitude = Math.max(highestAltitude,currentAltitude);
        }
        return highestAltitude;


        
        
    }
}