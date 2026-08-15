
//Hashmap vala solution
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         map.put(0, 1);

//         int sum = 0;
//         int count = 0;

//         for (int num : nums) {
//             sum += num;

//             if (map.containsKey(sum - k))
//                 count += map.get(sum - k);

//             map.put(sum, map.getOrDefault(sum, 0) + 1);
//         }

//         return count;
//     }
// }

class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                sum += nums[j];

                if (sum == k) {

                    count++;

                }
            }

        }

        return count;

    }

}