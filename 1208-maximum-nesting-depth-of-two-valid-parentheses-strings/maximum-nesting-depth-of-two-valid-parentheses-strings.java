class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int res[] = new int[seq.length()];
        int open = 0;
        int close = 0;

        for(int i = 0; i < seq.length(); i++) {
            char ch = seq.charAt(i);
            if(ch == '(') {
                res[i] = open;
                open ^= 1;
            } else if(ch == ')') {
                res[i] = close;
                close ^= 1;
            }
        }

        return res;
    }
}