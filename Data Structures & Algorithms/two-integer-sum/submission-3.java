class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        int diff=0;
        for(int i=0;i<nums.length;i++){
            diff = target - nums[i];
            if(arr.containsKey(diff)){
                return new int[]{arr.get(diff),i};
            }
            arr.put(nums[i],i);
        }
        return new int[0];
    }
}
