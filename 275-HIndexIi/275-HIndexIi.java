// Last updated: 8/2/2025, 11:36:07 PM
class Solution {
    public int hIndex(int[] citations) {
        int start=0,end=citations.length-1;
        int ans=0,index=0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(citations[mid]<=(citations.length-mid)){
                if(ans<=citations[mid]){
                    ans = citations[mid];
                    index = mid;
                }
                start=mid+1;
            }else{
                end = mid-1;
            }
        }

        if(citations[index]<(citations.length-index)){
            if( (index+1)<citations.length && citations[index+1] >= (citations.length-index-1) )
                ans = Math.max(ans,(citations.length-index-1));
        }
        if(citations[0]>=citations.length){
            ans = citations.length;
        }
        return ans;
    }
}