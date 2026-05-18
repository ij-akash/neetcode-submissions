class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }
        char[] s1= s.toCharArray();
        char[] t1= t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        for(int i=0;i<s1.length;i++){
            if(s1[i]!=t1[i]){
                return false;
            }
        }
        return true;

        // HashSet<Character> set = new HashSet<>();
        // for(char val : s1){
        //     set.add(val);
        // }
        // for(char val : t1){
        //     set.remove(val);
        // }
        // if(set.size()==0){
        //     return true;
        // }
        // return false;
    }
}
