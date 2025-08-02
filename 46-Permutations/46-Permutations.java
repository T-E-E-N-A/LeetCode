// Last updated: 8/2/2025, 11:56:54 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            li.add(nums[i]);
        }
        List<List<Integer>> lis = new ArrayList<>();
        lis.add(new ArrayList<>(li));
        boolean bta = true;
        while(bta){
            bta = permutation(li,lis);
        }
        return lis;
    }
    public static boolean permutation(List<Integer> s , List<List<Integer>> lis){
        int p=-1;
        for(int i=s.size()-2 ; i>=0 ; i--){
            if(s.get(i)<s.get(i+1)){
                p=i;
                break;
            }
        }
        int q = -1;
        if(p!=-1){
            for(int i=s.size()-1 ; i>=0 ; i--){
                if(s.get(i)>s.get(p)){
                    q=i;
                    break;
                }
            }
            int ch = s.get(q);
            s.set(q,s.get(p));
            s.set(p,ch);
        }else{
            return false;
        }
        int i=p+1,j=s.size()-1;
        while(i<j){
            int temp = s.get(i);
            s.set(i,s.get(j));
            s.set(j,temp);
            i++;j--;
        }
        lis.add(new ArrayList<>(s));
        return true;
    }
}