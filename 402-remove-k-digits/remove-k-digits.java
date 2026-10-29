class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char ch : num.toCharArray()) {
            while(!stack.isEmpty() && k > 0 && stack.peekLast() > ch) {
                stack.removeLast();
                k--;
            }
            stack.addLast(ch);
        }

        while(k > 0) {
            stack.removeLast();
            k--;
        }

        while(stack.size() > 1 && stack.peekFirst() == '0') {
            stack.removeFirst();
        }
        if(stack.size() == 0) {return "0";}

        StringBuilder res = new StringBuilder();
        for(char ch : stack) {
            res.append(ch);
        }

        return res.toString();
    }
}