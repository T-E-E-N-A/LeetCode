// Last updated: 8/2/2025, 11:29:41 PM
class Solution {
    public String clearStars(String s) {
        int[] freq = new int[26];

        // pq in which smallest alphabet will come on top and if more than 1 occurence than last index come on top on pq something comparator is used
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) return Integer.compare(b[1],a[1]);
            return Integer.compare(a[0],b[0]);
        });

        StringBuilder ans = new StringBuilder();
        boolean[] flag = new boolean[s.length()];
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch!='*'){
                freq[ch-'a']++;
                pq.add(new int[]{ch-'a',i});
            }else{
                int[] c = pq.poll();
                freq[c[0]]--;
                flag[c[1]] = true;
                flag[i] = true;
            }
        }
        for(int i=0 ;i<s.length() ; i++){
            if(!flag[i])
                ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}