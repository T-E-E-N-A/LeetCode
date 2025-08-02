// Last updated: 8/2/2025, 11:57:41 PM
class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int start=0,end= height.length -1;
        while(start<end){
            int water = (end-start)*Math.min(height[start],height[end]);
            max = Math.max(water,max);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}