class Solution {
    public boolean checkValidString(String s) {
        int left = 0, right = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                left++;
                right++;
            } else if(ch == ')') {
                left--;
                right--;
            } else {
                left--;
                right++;
            }

            if(right < 0) {return false;}
            left = Math.max(left, 0);
        }

        return left==0;
    }
}