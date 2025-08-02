// Last updated: 8/2/2025, 11:33:29 PM
class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ele1 = majElement(tops);
        int ele2 = majElement(bottoms);
        int ans=0,ans1=0;
        boolean flag=false;
        for(int i=0 ; i<tops.length ; i++){
            if(tops[i]!=ele1){
                if(bottoms[i]!=ele1){
                    if(flag) return -1;
                    flag=true;
                }
                ans++;
            }
            if(bottoms[i]!=ele2){
                if(tops[i]!=ele2){
                    if(flag) return -1;
                    flag = true;
                }
                ans1++;
            }
        }
        return Math.min(ans,ans1);
    }
    public int majElement(int[] nums) {
        int c=1;
        int ele=nums[0];
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]==ele){
                c++;
            }else{
                c--;
            }
            if(c==0){
                ele=nums[i];
                c=1;
            }
        }
        return ele;
    }
}