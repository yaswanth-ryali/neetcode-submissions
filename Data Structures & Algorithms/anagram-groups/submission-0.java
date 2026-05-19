class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String se = new String(c);
            if(!map.containsKey(se)){
                map.put(se,new ArrayList<>());
                
            }
            map.get(se).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
