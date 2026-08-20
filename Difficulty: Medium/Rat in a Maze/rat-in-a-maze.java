class Solution {
   
   static boolean isSafeToMove(int newX,int newY,int n ,int[][]maze,boolean [][] visited)
   {
       if(newX < 0 || newX>=n ||newY < 0 ||newY >=n){
           
           //out of bound vala case ;
           return false ;
           
       }
       else if(maze[newX][newY]==0){
           //blocked cell vala case;
           
           return false ;
           
       }
       else if(visited[newX][newY] ==true){
           
           //already visited vala caase 
           return false ;
           
       }
       else 
        {
            return true ;
        }
   }
   
   static void solve(int [][]maze,int srcX,int srcY, int destX,int destY,boolean [][] visited
   , ArrayList<String> ans ,String path){
       
       // base case ;
       
       if(srcX ==destX && srcY==destY){
           
           ans.add(path);
           return ;
       }
       
       visited[srcX][srcY]=true;
       
       int n = maze.length;
       
       //ab i have 4 movements
       
       //up
       int newX = srcX-1;
       int newY=srcY;
       
       if(isSafeToMove(newX,newY,n,maze ,visited)) {
           
           //toh baki recursion samabhal lega 
           solve(maze , newX,newY,destX,destY,visited,ans ,path + "U");
           
       }
       
       
       //down
       
       newX = srcX+1;
       newY=srcY;
       
       if(isSafeToMove(newX,newY,n,maze,visited)) {
           solve(maze ,newX,newY,destX,destY,visited,ans ,path +"D");
           
       }
           
           
           
       
         
        //left
         
         newX= srcX;
         newY=srcY-1;
        if(isSafeToMove(newX,newY,n,maze,visited)){
           
           solve(maze ,newX,newY,destX,destY,visited,ans ,path +"L");
          }
       //right
       
       newX=srcX;
       newY=srcY+1;
       
       if(isSafeToMove(newX,newY,n,maze,visited)){
           
           solve(maze ,newX,newY,destX,destY,visited,ans ,path +"R");
           
        }
        
        // kyoki maine chaaro direction try krali hai 
        // na ab mujhe wapas return krna h;
        // toh ab mujhe undo valla step krna padega 
        //undo vala step -> backtracking step hai
        
        visited[srcX][srcY] = false ;
        //ye main baar baar bhul jata hu ;
    
   }
   
   
   
    public ArrayList<String> ratInMaze(int[][] maze) {
            
            int srcX = 0; // row index pe mera rat 
            int srcY= 0;  // column index pe mera rat
            
            int n = maze.length;
            
            int destX = n-1; // meujhe rat ko kaha pouchana hai voh vali destination
            int destY = n-1; // which is mention in the question
            
            boolean [][] visited = new boolean [n][n];
            
            ArrayList<String> ans = new ArrayList<>();
            
            String path = ""; // instialyy empty  baad me show krte hai 
            
            //i src location cell is a blocked cell or dest is a blocked cell;
            
            if(maze [0][0] ==0|| maze [n-1][n-1] ==0){
                return ans ;
                
            }
            
            solve(maze ,srcX,srcY,destX,destY,visited,ans ,path);
            
            Collections.sort(ans);
            return ans ;
            
    }
}