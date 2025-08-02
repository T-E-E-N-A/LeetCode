// Last updated: 8/2/2025, 11:33:22 PM
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0,len=mountainArr.length()-1;
        int end = len;
        int pivot=-1;
        while(start<end){
            int mid = start + (end-start)/2;
            int ele = mountainArr.get(mid);
            if(mid>start && mid<end && ele> mountainArr.get(mid+1) && ele>mountainArr.get(mid-1)){
                pivot=mid;
                break;
            }
            if(start==mid && start==end){
                pivot=start;
                break;
            }
            // write conditions here
            if(mid<end && ele<mountainArr.get(mid+1)){
                start=mid;
            }else{
                end = mid;
            }
        }
        int ans = binarySearch(false,target,0,pivot,mountainArr);
        if(ans!=-1){
            return ans;
        }
        ans = binarySearch(true,target,pivot+1,len,mountainArr);
        if(ans!=-1){
            return ans;
        }
        return -1;
    }
    public int binarySearch(boolean isRev ,int target,int start,int end , MountainArray mountainArr){
        while(start<=end){
            int mid = start + (end-start)/2;
            int ele = mountainArr.get(mid);
            if(ele==target){
                return mid;
            }
            if(isRev){
                if(ele>target){
                    start=mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(ele>target){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}