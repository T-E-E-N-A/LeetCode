class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->{
            return map.get(b)-map.get(a);
        });
        for(Character ch : map.keySet()){
            pq.add(ch);
        }

        StringBuilder str = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll();
            for(int i=1 ; i<=map.get(ch) ; i++){
                str.append(ch);
            }
        }
        return str.toString();
    }
}