class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String var = new String(chars);
            map.putIfAbsent(var, new ArrayList<>());
            map.get(var).add(str);
        }
        return new ArrayList(map.values());
    }
}
