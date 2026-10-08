// class Solution {
//     public String simplifyPath(String path) {

//         Deque <String> st = new ArrayDeque<>(); // stack create 
  
//         String[] parts = path.split("/"
//         );     // create the split path // split kroo whole the  o/p ko 

//         for(String part :parts){ // for each use 

                // igonore hone vale part 
//             if(part.isEmpty()){
//                 //ignore 
//                 continue;

//             }

//             if(part.equals(" . ") && st.isEmpty()){
//                 //ignore 
//                 continue;

//             }

//             if(part.equals("..") && st.isEmpty()){
//                 //ignore 

//                 continue ;


//             }

                // back directory 
//            ( !st.isEmpty()) &&  if(part.equals("..")){
//                 st.pop();

//             }
//             else{
//                 st.push(part);

//             }
//         }

//         if(st.isEmpty()){
//             //iska matlb main root directory pr hu 
//             return "/";

//         }
//         else{

//             // agar stack empty nhi h , toh answer build kr lo string builder se 
//             StringBuilder str = new StringBuilder();

//             while(!st.isEmpty()){
//                 str.append("/");
//                 str.append(st.removeLast());
//                 // st.pop();

//             }
//             return str.toString();
//         }

            

//     }
// }

class Solution {
    public String simplifyPath(String path) {

        Deque<String> st = new ArrayDeque<>();

        String[] parts = path.split("/");

        for(String part : parts) {

            // Ignore empty parts and "."
            if(part.isEmpty() || part.equals(".")) {
                continue;
            }

            // Go one directory back
            if(part.equals("..")) {

                if(!st.isEmpty()) {
                    st.pop();
                }

            }
            else {
                st.push(part);
            }
        }

        if(st.isEmpty()) {
            return "/";
        }

        StringBuilder str = new StringBuilder();

        while(!st.isEmpty()) {
            str.append("/");
            str.append(st.removeLast());
        }

        return str.toString();
    }
}