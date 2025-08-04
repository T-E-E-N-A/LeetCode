class Solution {
    public int totalFruit(int[] fruits) {
        // create a window
        int a=-1,b=-1,i=0,ai=0,bi=0;
        int ans=0;
        for(i=0 ; i<fruits.length; i++){
            if(a==-1 || a==fruits[i]){
                a=fruits[i];
                ai=i;
            }else if(b==-1 || b==fruits[i]){
                b = fruits[i];
                bi=i;
            }else{
                break;
            }
        }
        ans = i;
        int start=0,end=i;
        while(end<fruits.length){
            if(fruits[end]==a){
                ai=end;
            }else if(fruits[end]==b){
                bi=end;
            }else{
                if(ai<bi){
                    a=fruits[end];
                    start = ai+1;
                    ai = end;
                }else{
                    b =  fruits[end];
                    start = bi+1;
                    bi = end;
                }
            }
            ans = Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}