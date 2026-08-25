class Solution {

    static boolean findEmptyCell(char [][] board,int [] emptyCell ){

        for(int i = 0;i<9 ;i++){

            for(int j = 0;j<9;j++){
                //store empty cell ki row ;
                if(board[i][j] =='.'){
                emptyCell[0] = i;

                // store empty cell ki column ;

                emptyCell[1] = j;
                return true ;
                }

            }
        }
        // kaknin pr bhi empty cell nhi mila toh main line  no 20 paa aunga 
        return false ;
    
    }

    static boolean isSafeToPlace( char [][] board, char charValue,int rowIndex , int colIndex){

        // rules ; 
        // check for. horizantal or same row ;
            //row Index sab cell k liye same rahega 
            // and col ka index - to <9 tk move krega

            for(int col = 0 ; col<9;col ++){

                if(board[rowIndex][col] == charValue)
                return false  ;
            }

        // check for vertical or same column 
            // colIndex sab cell ke liye same rrahega 
            // row ka index 0 to <9 tk move krra h 

            for(int row = 0 ;row<9;row ++){
                if(board[row] [colIndex]== charValue)
                return false ;
            }

        // check for current 3*3 vala sub box 
        //main thing 

            // 3X3 ki bohot sari matrix hai toh bhai mujhe harr matrix ka starting index  of row and col pta chal jaye toh maja aaajaye

            int startRow = rowIndex - rowIndex %3;
            int startCol= colIndex - colIndex %3;

            for(int i =0 ;i<3 ; i++){
                for(int j = 0;j<3 ; j++){
                    int actualRow = startRow +i;
                    int actualCol = startCol +j;

                    if(board[actualRow][actualCol] ==charValue){
                        return false;
                    }

                }
            }

            // safe to place ;
          return true ;

    }

   
   static boolean  solveSudokuHelper(char [][] board)
    {

        //base case;
        // main tb mannunga k mera puzzle solve hai , jab saare empty space fill hogaye honge ;

        // when there is no empty space inside the board , then the probelm is solved ;

        int [] emptyCell = new int [2];
         if( !findEmptyCell(board , emptyCell)){
            return true ;

            // mera question solve hochuka hai 
        }

        // if lets say i found a empty cell 

        int rowIndex = emptyCell[0];
        int colIndex = emptyCell[1];

        for(int value = 1 ; value<=9;value++){
            char charValue = (char)(value + '0'); // ye vali value ko main apnr board  ke row and col me daalna chahata hu ;

            // so mujhe safety check krni hogi 

            if(isSafeToPlace(board, charValue, rowIndex , colIndex)){
                // palce krdo 
                board[rowIndex][colIndex] = charValue;

                // baki recursion samabl lega 

                if(solveSudokuHelper(board)==true){

                    return true ;
                }

                // agar recursion solve nhi kr paaya , or wapas aagya 
                // current value ko undo or backtrcking wala step kro 

                board[rowIndex][colIndex] = '.';
            }


        }

        
        // not able to solve the problem 

        return false ;

       


    }
    public void solveSudoku(char[][] board) {

        solveSudokuHelper(board);

       
    }
}