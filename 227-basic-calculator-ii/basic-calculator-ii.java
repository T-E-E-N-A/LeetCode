// CAN I DO IT WITHOUT STACK = YES!!!!
// we r using stack just for addition and retreiving last element only so i used a variable for that
class Solution {
    public int calculate(String s) {
        int ans=0;
        int last=0;
        int num=0;
        char prev='+';
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)) num = num*10 + ch-'0';
            else if(ch!=' '){
                if(prev=='+'){
                    ans += last;
                    last = num;
                }
                else if(prev=='-'){
                    ans += last;
                    last = -num;
                }
                else if(prev=='*') last = last*num;
                else if(prev=='/') last = last/num;

                prev = ch;
                num=0;
            }
        }
        if(prev=='+'){
            ans += last;
            last = num;
        }else if(prev=='-'){
            ans += last;
            last = -num;
        }else if(prev=='*') last = last*num;
        else if(prev=='/') last = last/num;

        return ans+last;
    }
}

// class Solution {
//     public int calculate(String s) {
//         Stack<Integer> st = new Stack<>();
//         int num=0;
//         char prev='+';
//         for(char ch : s.toCharArray()){
//             if(Character.isDigit(ch)) num = num*10 + ch-'0';
//             else if(ch!=' '){
//                 if(prev=='+') st.push(num);
//                 else if(prev=='-') st.push(-num);
//                 else if(prev=='*' && !st.isEmpty()){
//                     st.push(st.pop()*num);
//                 }else if(prev=='/' && !st.isEmpty()){
//                     st.push(st.pop()/num);
//                 }
//                 prev = ch;
//                 num=0;
//             }
//         }
//         if(prev=='+') st.push(num);
//         else if(prev=='-') st.push(-num);
//         else if(prev=='*' && !st.isEmpty()){
//             st.push(st.pop()*num);
//         }else if(prev=='/' && !st.isEmpty()){
//             st.push(st.pop()/num);
//         }
//         int ans=0;
//         while(!st.isEmpty()) ans+= st.pop();
//         return ans;
//     }
// }