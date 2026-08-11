// we can solve this question my two methods frist hash map jisme hum count and the nums ko rec. krte hai and then 
// jiski jyda freq hai usko return krte hai 

// sec hai Boyer–Moore Majority Vote Algorithm 

//ye solution Boyer–Moore Majority Vote Algorithm hai 
//tc = O(n)
//sc = O(1)
// class Solution {


//     public int majorityElement(int[] nums) {
//     //pehel toh count  ko and candidate 2 varible and 
//     // dono 0 pe 

//         int count =0;
//         int  candidate = 0;

// //itrate into whole array 
//         for(int i =0;i<nums.length;i++){
//             // jb mera count =0 hoga tb me vo number store kra dunga into the candidate me 
//             if(count==0){
//                 candidate =nums[i];

//             }
//             // if mera nums[i] and candidate equal aarahe hai then  me count ko ++ and nhi aaarahe hai toh count ko -- 
//             if(nums[i]==candidate){

//                 count++;
//             }
//             else {
//                 count --;

//             }
//         }
//         // last me return ;

//         return candidate;
//     }
// }

// now using the hash map 

//so hash map  store the data into the key and value pairs and in this question humko asa num find krna hia jiki freq n/2 aaati ho in this array 2,2,1,1,1,2,2 there i n =7 and n/2 is equal to 3 so jiski freq n/2 se jyda hai usko return kr do ;

class Solution {


   public int majorityElement(int[] nums) {

    // create hash map 

    HashMap<Integer,Integer> map = new HashMap<>();

    for(int freq :nums){

        map.put(freq,map.getOrDefault(freq,0)+1);

    }

    for (int num:nums){
       if (map.get(num) >nums.length/2){
        return num;

       }

    }
    return -1;
   }
}



