class Solution {
    void generateParentheses(List<String> res, String s, int open, int close, int n) {
        if(s.length() == 2 * n) {
            res.add(s);
            return;
        }

        if(open < n) {
            generateParentheses(res, s+"(", open+1, close, n);
        }
        if(close < open) {
            generateParentheses(res, s+")", open, close+1, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParentheses(res, "", 0, 0, n);

        return res;
    }
}