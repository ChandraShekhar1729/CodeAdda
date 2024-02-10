class Solution {
    
   public  boolean isPalindrome( String s){
        
        boolean ans =true;
        int start=0, end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                ans=false;
                break;
            }
            
            start++;
            end--;
        }
        
        return ans;
    }
    public int countSubstrings(String s) {
        
        int ans =0;
    
        
        for( int i=0;i<s.length();i++){
            
            
            if(i!=s.length()-1){
            
            for( int j=i+1;j<=s.length();j++){
                
                if(isPalindrome(s.substring(i,j))==true){
                    ans+=1;
                }
    }
             }
              else{
            
            ans+=1;
           }
            
         
        
      
        
        
    
    
         }
     return ans;   
    }
        
    
}