// Last updated: 8/2/2025, 11:35:26 PM
import java.util.Arrays;
class Solution {
    public String originalDigits(String s) {
        StringBuilder ans = new StringBuilder();
        int[] freq = new int[26];
        for(int i=0 ; i<s.length() ; i++){
            freq[s.charAt(i)-'a']++;
        }
        int count = freq['z'-'a'];
        freq['o'-'a'] -= count;
        while(count-->0){
            ans.append("0");
        }

        // two
        count = freq['w'-'a'];
        freq['t'-'a'] -= count;
        freq['o'-'a'] -= count;
        while(count-->0){
            ans.append("2");
        }
        // four
        count = freq['u'-'a'];
        freq['f'-'a'] -= count;
        freq['o'-'a'] -= count;
        while(count-->0){
            ans.append("4");
        }
        // six
        count = freq['x'-'a'];
        freq['s'-'a'] -= count;
        while(count-->0){
            ans.append("6");
        }
        // eight
        count = freq['g'-'a'];
        freq['e'-'a'] -= count;
        freq['t'-'a'] -= count;
        while(count-->0){
            ans.append("8");
        }



        // 1
        count = Math.min(freq['o'-'a'],Math.min(freq['n'-'a'],freq['e'-'a']));
        freq['o'-'a'] -= count;
        freq['n'-'a'] -= count;
        freq['e'-'a'] -= count;
        while(count-->0){
            ans.append("1");
        }
        // three
        count = Math.min(Math.min(freq['t'-'a'],freq['r'-'a']),Math.min(freq['h'-'a'],freq['e'-'a']/2));
        freq['t'-'a'] -= count;
        freq['h'-'a'] -= count;
        freq['r'-'a'] -= count;
        freq['e'-'a'] -= count*2;
        while(count-->0){
            ans.append("3");
        }
        // five
        count = freq['f'-'a'];
        freq['i'-'a'] -= count;
        freq['v'-'a'] -= count;
        freq['e'-'a'] -= count;
        while(count-->0){
            ans.append("5");
        }
        // seven
        count = freq['v'-'a'];
        freq['n'-'a'] -= count;
        while(count-->0){
            ans.append("7");
        }
        // nine
        count = freq['n'-'a']/2;
        while(count-->0){
            ans.append("9");
        }
        char[] arr = new char[ans.length()];
        ans.getChars(0, ans.length(), arr, 0);
        Arrays.sort(arr);
        return new String(arr);
    }
}