class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        int t1=0,t2=nums.length-1,sum=0;
        while(t1<t2){
            sum = arr[t1][0]+arr[t2][0];
            if(sum==target){
                return new int[]{Math.min(arr[t1][1],arr[t2][1]),
                Math.max(arr[t1][1],arr[t2][1])};
            }else if(sum<target){
                t1++;
            }else if(sum>target){
                t2--;
            }
        }
        return new int[0];
    }
}
