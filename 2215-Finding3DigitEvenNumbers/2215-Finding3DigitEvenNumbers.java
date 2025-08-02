// Last updated: 8/2/2025, 11:31:26 PM
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> ans = new ArrayList<>();
        int[] arr = new int[10];
        for(int i: digits){
            arr[i]++;
        }
        for(int i=100 ; i<999 ; i+=2){
            int a = i%10;
            int b = (i/10)%10;
            int c = (i/100);
            if(arr[a]>0) arr[a]--;
            else continue;
            if(arr[b]>0) arr[b]--;
            else{
                arr[a]++;
                continue;
            }
            if(arr[c]>0) arr[c]--;
            else{
                arr[a]++;
                arr[b]++;
                continue;
            }
            ans.add(i);
            arr[a]++;arr[b]++;arr[c]++;
        }
        int[] answer = new int[ans.size()];
        int j=0;
        for(int i : ans){
            answer[j++] = i;
        }
        return answer;
    }
}