// Last updated: 8/2/2025, 11:31:49 PM
class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    // 'why hashmap of num2' , go see constraints
    private Map<Integer , Integer> map;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        this.map = new HashMap<>();
        for(int i=0 ; i<nums2.length ; i++){
            map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
        map.put(nums2[index],map.get(nums2[index])-1);
        nums2[index] += val;
        map.put(nums2[index],map.getOrDefault(nums2[index],0)+1);
    }
    
    public int count(int tot) {
        int ans=0;
        for(int i=0 ;i<nums1.length ; i++){
            ans += map.getOrDefault(tot - nums1[i],0);
        }
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */