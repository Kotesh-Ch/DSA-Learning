class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int idx = 0;

        for(String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);

            if(map.containsKey(str)) {
                res.get(map.get(str)).add(s);
            } else {
                map.put(str, idx);
                List<String> list = new ArrayList<>();
                list.add(s);
                res.add(list);
                idx++;
            }
        }

        return res;
    }
}