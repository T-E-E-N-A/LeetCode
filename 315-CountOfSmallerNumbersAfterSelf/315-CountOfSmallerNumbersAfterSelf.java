// Last updated: 8/2/2025, 11:36:04 PM
class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> li = new ArrayList<>();
        List<Integer> sortt = new ArrayList<>();
        for(int num : nums){
            sortt.add(num);
        }
        Collections.sort(sortt);
        for(int num:nums){
            int ele = binarySearch(sortt,num);
            li.add(ele);
            sortt.remove(ele);
        }
        return li;
    }
    public int binarySearch(List<Integer> sortt,int target){
        int start=0,end = sortt.size()-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>sortt.get(mid)){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}