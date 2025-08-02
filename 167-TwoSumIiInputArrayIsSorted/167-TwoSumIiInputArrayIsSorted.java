// Last updated: 8/2/2025, 11:55:15 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0,end=numbers.length-1;
        while(start<end){
            int sum = numbers[start] + numbers[end];
            if(sum>target){
                end--;
            }else if(sum<target){
                start++;
            }else{
                break;
            }
        }
        int[] arr = {start+1,end+1};
        return arr;
    }
}