class Solution {

   
   
   private Integer[][] memo;

public int minimumTotal(List<List<Integer>> triangle) {
	int n = triangle.size();
	memo = new Integer[n][n];
	return dfs(0, 0, triangle);
}

private int dfs(int level, int i, List<List<Integer>> triangle) {
	if (memo[level][i] != null) return memo[level][i];

	int path = triangle.get(level).get(i);
	if (level < triangle.size() - 1) 
		path += Math.min(dfs(level + 1, i, triangle), dfs(level + 1, i + 1, triangle));

	return memo[level][i] = path;
}
}

   
   
   
   
   
//     static int solve(List<List<Integer>> triangle,int rowIndex,int columnIndex){
//         // base case 
//         if(rowIndex == triangle.size()-1){
//             // jis value pr khade ho , use path me include  krdena  then wapas jao 

//             return triangle.get(rowIndex).get(columnIndex);
            
//         }

//         // 1 case hum solve krenge and baki recursion samabhal lega

//         int downAns = solve(triangle, rowIndex+1,columnIndex);
        
//         int diagnolAns = solve(triangle, rowIndex+1,columnIndex +1);

//         int finalAns = triangle.get(rowIndex).get(columnIndex) + Math.min(downAns , diagnolAns);

//         return finalAns ;

//     }



//     public int minimumTotal(List<List<Integer>> triangle) {

//         int rowIndex = 0;
//         int columnIndex = 0;

//         int ans = solve(triangle , rowIndex ,columnIndex);
//         return ans;

        
//     }
// }