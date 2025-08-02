// Last updated: 8/2/2025, 11:33:03 PM
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        String ch = folder[0];
        List<String> ans = new ArrayList<>();
        for(int j=0 ; j<folder.length ; j++){
            String i = folder[j];
            if(i.indexOf(ch+"/")==0){
                continue;
            }else{
                ans.add(i);
                ch = folder[j];
            }
        }
        return ans;
    }
}