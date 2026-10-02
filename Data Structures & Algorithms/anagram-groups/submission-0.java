class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if(map.containsKey(str))
            {
                List<String> strList = map.get(str);
                strList.add(s);
            }
            else{
                map.put(str, new ArrayList<>(List.of(s)));
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String s : map.keySet())
        {
            ans.add(map.get(s));
        }
        return ans;
    }
}
