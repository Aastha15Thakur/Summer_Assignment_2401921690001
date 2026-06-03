class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int n=height.length;
        int right=n-1;
        int maxarea=0;
        

        while(left<right){
            if(height[left]<height[right]){
                int w= right-left;
                int h=Math.min(height[left],height[right]);
                int area=h*w;
                if(area>maxarea){
                    maxarea=area;
                }
                
                left++;
            }
            else{
                int w= right-left;
                int h=Math.min(height[left],height[right]);
                int area=h*w;
                if(area>maxarea){
                    maxarea=area;
                }
                
                right--;
            }

        } 
        return maxarea;       
    }
}