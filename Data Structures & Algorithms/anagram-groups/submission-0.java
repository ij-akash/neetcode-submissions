class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String var = new String(chars);
            if(map.containsKey(var)){
                List<String> list = map.get(var);
                list.add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(var, list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}
