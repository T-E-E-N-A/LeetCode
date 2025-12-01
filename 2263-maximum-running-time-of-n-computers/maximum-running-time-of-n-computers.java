class Solution {
    public long maxRunTime(int n, int[] batteries) {
        if(batteries.length<n) return 0;
        long sum=0,min=batteries[0];
        for(int i:batteries){
            sum += i;
            min = Math.min(min,i);
        }
        if(batteries.length==n) return min;
        // Arrays.sort(batteries);
        long st=min,end=sum/n;
        long ans=min;
        while(st<=end){
            long mid = st + (end-st)/2;
            if(isPossible(mid,batteries,n)){
                ans=mid;
                st=mid+1;
            }else end=mid-1;
        }
        return ans;
    }
    public boolean isPossible(long span,int[] batteries,int n){
        // n computers will be able to run for span time??
        long rem=0;
        for(int i=batteries.length-1 ; i>=0 ; i--){
            if(batteries[i]>=span && n>0){
                n--;
            }else if(batteries[i]+rem>=span && n>0){
                rem=(batteries[i]+rem)-span;
                n--;
            }else{
                rem += batteries[i];
            }
        }
        return n<=0;
    }
}