// Last updated: 8/2/2025, 11:30:11 PM
class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1 ; i<=n ; i++){
            if(sum_of_digit(i*i+"",i+"" , 0)){
                sum+=i*i;
            }
        }
        return sum;
    }
    public boolean sum_of_digit(String ques , String n ,int ans){
        if(n.equals(ans+"") && ques.length()==0){
            return true;
        }
        if(ques.length()==0){
            return false;
        }
        for(int i=1 ; i<=ques.length() ; i++){
            if(sum_of_digit(ques.substring(i),n,ans+Integer.parseInt(ques.substring(0,i)))){
                return true;
            }
        }
        return false;
    }
}