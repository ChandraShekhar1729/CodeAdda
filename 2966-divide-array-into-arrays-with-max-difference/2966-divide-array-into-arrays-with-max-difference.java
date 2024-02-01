class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        
        Arrays.sort(nums);
        if(nums.length%3!=0){
            return new int[0][0];
        }
        
        
        int ans[][]= new int[nums.length/3][1];
        
        int j=0;
        for( int i=0;i<nums.length;i+=3){
            
             int x=nums[i];
            int y= nums[i+1];
            int z=nums[i+2];
            
            if(Math.abs(z-x)<=k){
                
                int[] xxx= {x,y,z};
                ans[j]=xxx;
                j++;
                
                
            }else{
                return new int[0][0];
            }
            
            
            
            
        }
        return ans;
        
        
        
        
    }
}