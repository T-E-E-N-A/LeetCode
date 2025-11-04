class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] arr = new int[nums.length-k+1];
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = x_sum(nums,i,i+k,x);
        }
        return arr;
    }
    public int x_sum(int[] nums,int i,int j,int k){
        if(k==0) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        for( ; i<j ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<pair> lis = new ArrayList<>();
        for(int key : map.keySet()){
            lis.add(new pair(key,map.get(key)));
        }
        Collections.sort(lis,(pair a,pair b)->{
            if(a.val==b.val) return b.k-a.k;
            return b.val-a.val;
        });
        int sum=0;
        for(i=0 ; i<Math.min(lis.size(),k) ; i++){
            sum += lis.get(i).val*lis.get(i).k;
        }
        return sum;
    }
    class pair{
        int k;
        int val;
        public pair(int k,int val){
            this.k = k;
            this.val = val;
        }
    }
}