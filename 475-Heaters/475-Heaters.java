// Last updated: 8/2/2025, 11:35:07 PM
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int min=0,max=houses[houses.length-1]-houses[0];
        int ans=-1;
        if(heaters[0]>houses[houses.length-1]){
            max = heaters[0]-houses[0];
        }
        while(min<=max){
            int mid = min + (max-min)/2;
            if(isPossible(houses,heaters,mid)){
                ans = mid;
                max=mid-1;
            }else{
                min = mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] houses , int[] heaters , int mid){
        int j=0;
        int i=0;
        while(i<houses.length){
            if(houses[i]<=(heaters[j]+mid) && houses[i]>=(heaters[j]-mid)){
                i++;
            }else{
                j++;
            }
            if(j>heaters.length-1){
                return false;
            }
        }
        return true;
    }
}