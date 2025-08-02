// Last updated: 8/2/2025, 11:32:40 PM
class Solution {
    public int numTeams(int[] rating) {
        int ans=0;
        boolean inc = false;
        for(int i=0;i<rating.length ; i++){
            for(int j=i+1 ; j<rating.length ; j++){
                if(rating[j]>rating[i]){
                    inc = true;
                }else{
                    inc=false;
                }
                for(int k=j+1 ; k<rating.length ; k++){
                    if(inc){
                        if(rating[k]>rating[j]){
                            ans++;
                        }
                    }else{
                        if(rating[k]<rating[j]){
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}