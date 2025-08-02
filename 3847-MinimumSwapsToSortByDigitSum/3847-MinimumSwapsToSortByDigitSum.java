// Last updated: 8/2/2025, 11:28:35 PM
class Solution {
    public int minSwaps(int[] nums) {
        int[][] arr = new int[nums.length][2];
        for(int i=0 ; i<nums.length ; i++){
            arr[i][0] = sum(nums[i]);
            arr[i][1] = nums[i];
        }
        Arrays.sort(arr , (a,b)-> (a[0]==b[0])?Integer.compare(a[1],b[1]) : Integer.compare(a[0],b[0]));
        return no_swaps(arr,nums);
    }
    public int sum(int n){
        int ans=0;
        while(n>0){ ans += n%10;
            n/=10;
        }
        return ans;
    }
    public int no_swaps(int[][] arr, int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            map.put(nums[i],arr[i][1]);
        }
        HashSet<Integer> visit = new HashSet<>();
        int swap=0;
        for(int num : map.keySet()){
            Integer idx = num;
            while(num!=map.get(idx) && !visit.contains(idx)){
                visit.add(idx);
                idx = map.get(idx);
                swap++;
            }
            visit.add(idx);
        }
        return swap;
    }
}