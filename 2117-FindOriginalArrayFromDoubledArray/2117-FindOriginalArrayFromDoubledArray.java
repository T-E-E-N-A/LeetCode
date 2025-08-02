// Last updated: 8/2/2025, 11:31:40 PM
class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2==1) return new int[0];
        Arrays.sort(changed);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<changed.length ; i++){
            map.put(changed[i],map.getOrDefault(changed[i],0)+1);
        }
        int c=0,k=0;
        int[] ans = new int[changed.length/2];
        for(int i=changed.length-1 ; i>=0 ; i--){
            if(map.getOrDefault(changed[i]/2 ,0)>0 && map.getOrDefault(changed[i],0)>0 && changed[i]%2==0){
                map.put(changed[i],map.get(changed[i])-1);
                if(map.get(changed[i]/2)>0)
                map.put(changed[i]/2,map.get(changed[i]/2)-1);
                else{
                    c++;
                    continue;
                }
                ans[k++] = changed[i]/2;
            }else{
                c++;
            }
        }
        if(c!=changed.length/2) return new int[0];
        return ans;
    }
}