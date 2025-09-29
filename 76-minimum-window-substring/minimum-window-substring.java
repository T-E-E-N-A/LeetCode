class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int[] freq = new int[128];
        for(char ch : t.toCharArray()){
            freq[ch]++;
        }

        int stIndex=0;
        int st=0,i=0;
        int len=Integer.MAX_VALUE;
        int cnt=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(freq[ch]-->0){
                cnt++;
            }

            while(cnt==t.length()){
                if(i-st+1<len){
                    len = i-st+1;
                    stIndex = st;
                }
                freq[s.charAt(st)]++;

                if(freq[s.charAt(st)]>0){
                    cnt--;
                }
                st++;
            }
            i++;
        }
        if(len==Integer.MAX_VALUE) return new String();
        return s.substring(stIndex,stIndex+len);
    }
}










// class Solution {
//     public String minWindow(String s, String t) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i=0; i<t.length() ; i++){
//             map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
//         }

//         int st=0,i=0;
//         String ans="";
//         int len=Integer.MAX_VALUE;
//         int cnt=0;
//         while(i<s.length()){
//             char ch = s.charAt(i);
//             if(map.containsKey(ch) && map.get(ch)>0){
//                 cnt++;
//             }

//             map.put(ch,map.getOrDefault(ch,0)-1);

//             while(cnt==t.length()){
//                 if(i-st+1<len){
//                     ans = s.substring(st,i+1);
//                     len = i-st+1;
//                 }
//                 map.put(s.charAt(st),map.getOrDefault(s.charAt(st),0)+1);

//                 if(map.get(s.charAt(st))>0){
//                     cnt--;
//                 }
//                 st++;
//             }
//             i++;
//         }
//         return ans;
//     }
// }