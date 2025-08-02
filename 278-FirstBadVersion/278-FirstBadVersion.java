// Last updated: 8/2/2025, 11:36:06 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1, end = n;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)==true){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end+1;
    }
}