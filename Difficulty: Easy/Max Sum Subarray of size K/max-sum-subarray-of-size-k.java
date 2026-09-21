class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum=windowsum+arr[i];
            
        }
        int maxSubarray=windowsum;
        for(int j=k;j<n;j++){
             windowsum=windowsum+arr[j];
            windowsum=windowsum-arr[j-k];
             maxSubarray=Math.max(maxSubarray,windowsum);
        }
        return maxSubarray;
    }
}