class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                product = product * nums[i];
            }else{
                count++;
            }
        }
        if(count>1){
            return new int[nums.length];
        }
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(count>0){
                result[i] = (nums[i]==0)?product:0;
            } else{
                result[i] = product/nums[i];
            }
        }
        return result;
    }
}  
