class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            int[] count = new int[26];
            for(char ch : str.toCharArray()){
                count[ch - 'a']++;
            }
            String value = Arrays.toString(count);
            map.computeIfAbsent(value, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList(map.values());
    }
}
