// Last updated: 8/2/2025, 11:55:16 PM
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        int[] li = new int[s1.length];
        for(int i=0 ; i<s1.length ; i++){
            li[i] = Integer.parseInt(s1[i]);
        }
        String[] s2 = version2.split("\\.");
        int[] lis = new int[s2.length];
        for(int i=0 ; i<s2.length ; i++){
            lis[i] = Integer.parseInt(s2[i]);
        }
        for(int i=0 ; i<Math.min(li.length,lis.length) ; i++){
            if(li[i]>lis[i]){
                return 1;
            }else if(li[i]<lis[i]){
                return -1;
            }
        }
        if(li.length>lis.length){
            int i=lis.length;
            while(i<li.length){
                if(li[i]!=0){
                    return 1;
                }
                i++;
            }
        }else if(lis.length > li.length){
            int i=li.length;
            while(i<lis.length){
                if(lis[i]!=0){
                    return -1;
                }
                i++;
            }
        }
        return 0;
    }
}