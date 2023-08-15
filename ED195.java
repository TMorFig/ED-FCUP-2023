public class ED195 {

    public static boolean balanced(String s){
        int i = 0;
        MyStack<Integer> k = new  LinkedListStack<Integer>();
        while (i !=s.length()){
            ////////////////////////////////////
            if (s.charAt(i) == '('){
                
                k.push(1);
                
            }
            
            if (s.charAt(i) == ')'){
                if (k.isEmpty()==true ){
                    return false;
                }
                if (k.top() == 1){
                    k.pop();
                }
                else{
                    return false;
                }
                
                
            }
            if (s.charAt(i) == '['){
                
                k.push(2);
                
            }
            
            if (s.charAt(i) == ']'){
                if (k.isEmpty()==true){
                    return false;
                }
                if (k.top() == 2){
                    k.pop();
                }
                else{
                    return false;
                }
                
                
            }

            i+=1;
            ///////////////////////////////////////////

            
        }
        if(k.isEmpty()==true){
            return true;
        }
        else{
            return false;
        }
        
    }
    
  
    
}