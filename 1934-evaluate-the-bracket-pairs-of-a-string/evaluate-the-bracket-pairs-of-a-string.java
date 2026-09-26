class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        StringBuilder res = new StringBuilder();

        for(List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '(' && s.charAt(i) != ')') {res.append(s.charAt(i));}
            if(s.charAt(i) == '(') {
                String temp = "";
                while(s.charAt(i+1) != ')') {
                    i++;
                    temp += s.charAt(i);
                }
                i++;
                res.append(map.getOrDefault(temp, "?"));
            }
        }

        return res.toString();
    }
}