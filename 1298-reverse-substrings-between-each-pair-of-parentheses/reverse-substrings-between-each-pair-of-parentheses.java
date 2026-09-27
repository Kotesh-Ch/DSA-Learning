class Solution {
    public String reverseParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(res.length());
            } else if(s.charAt(i) == ')') {
                int start = stack.pop();
                int end = res.length() - 1;
                reverseString(res, start, end);
            } else {
                res.append(s.charAt(i));
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