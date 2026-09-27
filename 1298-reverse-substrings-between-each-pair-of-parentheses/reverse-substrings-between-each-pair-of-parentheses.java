class Solution {
    public String reverseParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') {
                stack.push(res.length());
            } else if(ch == ')') {
                int left = stack.pop();
                int right = res.length() - 1;
                reverseString(res, left, right);
            } else {
                res.append(ch);
            }
        }

        return res.toString();
    }

    private void reverseString(StringBuilder s, int left, int right) {
       
        while(left < right) {
            char temp = s.charAt(left);
            s.setCharAt(left, s.charAt(right));
            s.setCharAt(right, temp);

            left++;
            right--;
        }
    }
}