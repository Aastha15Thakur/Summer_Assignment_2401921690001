class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        for (int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=sum;
        for(int i=1;i<=n -k;i++){
            sum=sum-nums[i-1]+nums[i+k-1];
            if(max<sum){
                max=sum;
            }
        }
        max=max/k;
        return max;
    }
}