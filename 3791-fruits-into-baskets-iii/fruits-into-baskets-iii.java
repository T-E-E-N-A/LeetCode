class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        // to store max of every segment
        List<Integer> lis = new ArrayList<>();
        int n = baskets.length;
        int m = (int)(Math.sqrt(n));
        int c=0;
        int max = baskets[0];

        // exactly (n/m) sectors  will be added but a sector that doesn't have sufficient element will remain
        for(int i=0 ; i<n ; i++){
            if(c==m){
                lis.add(max);
                c=1;
                max = baskets[i];
            }else{
                c++;
                max = Math.max(max,baskets[i]);
            }
        }
        // remaining sector
        if(c!=0)
            lis.add(max);
            

        // we have stored max of every sector having each sector elements m
        // now start the real question as prerequisites are done 

        int ans=0;
        // iterating over fruits
        for(int i=0 ; i<n ; i++){
            int unset=1;
            for(int j=0 ; j<lis.size() ;j++){
                if(lis.get(j)<fruits[i]) continue;
                else{
                    // going to be in that sector 
                    // so starting indx will be m*j
                    for(int k=m*j ; k<m*j+m && k<n ; k++){
                        if(baskets[k]>=fruits[i]){
                            baskets[k] = -1;
                            unset=0;
                            break;
                        }
                    }
                }
                if(unset==0){
                    // update max value in list then break sector loop and move to next element
                    max = baskets[m*j];
                    for(int k=m*j ; k<m*j+m && k<n ; k++){
                        max = Math.max(max,baskets[k]);
                    }
                    lis.set(j,max);
                    break;
                }
            }
            ans += unset;
        }
        return ans;
    }
}