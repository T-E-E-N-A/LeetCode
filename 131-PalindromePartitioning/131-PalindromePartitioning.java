// Last updated: 8/2/2025, 11:55:50 PM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> lis = new ArrayList<>();
        partition(lis,s,new ArrayList<>());
        return lis;
    }
    public void partition(List<List<String>> lis,String ques,List<String> ans){
        if(ques.length()<=0){
            lis.add(new ArrayList<>(ans));
            return;
        }
        for(int i=1 ; i<=ques.length() ; i++){
            String s = ques.substring(0,i);
            if(palindrome(s)){
                ans.add(s);
                partition(lis,ques.substring(i),ans);
                ans.remove(ans.size()-1);
            }
        }
    }

    public boolean palindrome(String s){
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        // if every s of start == s of end
        return true;
    }
}