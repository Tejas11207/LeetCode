class Solution {
    public int removeElement(int[] nums, int val) {

        // i can use the brute force but  mai use kr raha hu 2 pointer method ,
        // where mera i vala pointer move krega but j vala pointer nhi krega move 

        // j ko = 0 pe 

        // if mera  i ki value val or k jese ho toh me  j = i kr dunga  then j++ ;

        // so basiclly mera element remove hone ki jagah replace ho rahah 

        //  3 remove nho replace 

        // final output [2,2,2,2,]


        int n = nums.length;
        //int i =0;
        int j =0;

       for(int i =0;i<n;i++){

            if(nums[i]!= val){
                nums[j] = nums[i];
                j++;

            }

        }
        return j;

    }
}