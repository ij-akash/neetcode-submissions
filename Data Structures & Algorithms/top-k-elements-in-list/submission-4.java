class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] arr = new List[nums.length + 1];

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = new ArrayList<>();
        }

        map.forEach((key, value)->{
            arr[value].add(key);    
        });
        int[] result = new int[k];
        int index=0;
        for(int i=arr.length-1; i>0 && index < k; i--){
            for(int n : arr[i]){
                if(index>k){
                    return result;
                }else{
                    result[index]=n;
                    index++;
                }       
            }
        }
        return result;
    }
}
