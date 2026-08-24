class Solution {
   
   static boolean isSafeToPlace(int rowIndex,int colIndex,int n ,char [][] board){

     // me only left vali quees ki ke hisb se code design kr raha hu;
     // jo mene pehle place kr di voh to free hai unpe toh koi attack bhi nhi kr raha hai 
    // check left horizontal 
    int row = rowIndex;
    int col = colIndex;

    while(col>=0){
        if(board[row][col] == 'Q'){

            return false ;
        }
        // row index me koi change nhi knra hai
        // col index ki value zero tk travel kregei'

        col--;
    }
    // check left uppar  digonal

    row = rowIndex;
    col = colIndex;

    while(row>=0 && col>=0){
        if(board[row][col]=='Q'){
            return false ;

        }
        row = row-1;
        col = col-1;

    }

    // check left longe dig;

    row = rowIndex ;
    col = colIndex;

    while(row<n && col >=0){
        
         if(board[row][col]=='Q'){
            return false ;

        }
        row = row+1;
        col = col-1;
    }
    // else 
    return true;

   }
   
   
   static void solve(char [][] board , int n , int colIndex, List<List<String>> ans){

    // base case ;

    if(colIndex>=n){
        // iska matlb board pr merko ek valid arrengment milgayi h 
        // iss valid arrangment ko ans me store krlo;

        // ek list ke aander sare board[i] ko store kro 
        // then uss ans ko ans ke aander add krdo

        List<String> temp = new ArrayList<>();
        for(int i =0;i<n;i++){
            temp.add(new String(board[i]));
        }
        ans.add(temp);
        return ;
    }

    // 1 case hum solve krnge baki recursion sambhal lega 
    // current column k haar cell pr jaake ya fr current column  haar row pe jake 
    // queen place krunga and rest recursion sambhal lega 

    // me choose krta ho rows ko 

    for (int rowIndex =0; rowIndex <n;rowIndex++){

        if (isSafeToPlace(rowIndex,colIndex,n,board)){
            // place queen;

            board[rowIndex][colIndex] ='Q';

            // baki ab recursion sambhal lega ;
            solve(board, n,colIndex+1,ans);
            // important -> undo ya fr backtracking wala step mat bhulna 
            // jab mera kaam hoja tb me Q replace krdunga "." se 
            board[rowIndex][colIndex] = '.';
        }
    }
   }
   
   
    public List<List<String>> solveNQueens(int n) {
        
        // pehle toh humne ek cheess board creat kiya  as the size of n ;
        // which is 4X4 ;
        char  board [][] = new char[n][n];
        

        // uske baad hum pure cheess board pe travel kiya hai or unko fill kiya with the " . " dot se as mention is questions;

        for(int i=0;i<n ; i++){

            Arrays.fill(board[i],'.');

        }
        int colIndex = 0;

        List<List<String>> ans = new ArrayList<>();

        // then function. call mardi
        solve (board , n , colIndex,ans);
        return ans ;

    }
}