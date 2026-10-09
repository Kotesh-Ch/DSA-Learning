class Solution {
    public int minInsertions(String s) {
       int count = 0;
       int res = 0;
       for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            } else {
                if(count == 0) {
                    count++;
                    res++;
                } 
                if(i+1 < s.length() && s.charAt(i+1) == ')') {
                    count--;
                    i++;
                } else {
                    res++;
                    count--;
                }
            }
       }

       res += 2*count;

       return res;
    }
}