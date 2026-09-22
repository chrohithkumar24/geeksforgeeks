class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int n=arr.length;
        int max_count=1;
        int current_count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                current_count++;
                
            }
                else
                {
                    current_count=1;
                    
                }
                max_count=Math.max(max_count,current_count);
                
            
        }
        return max_count;
        
    }
}
