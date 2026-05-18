class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s1= new HashMap<>();
        HashMap<Character, Integer> t1= new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
            t1.put(t.charAt(i),t1.getOrDefault(t.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> value: s1.entrySet()){
            if(!value.getValue().equals(t1.get(value.getKey()))){
                return false;
            }
        }
        return true;
    }
}
