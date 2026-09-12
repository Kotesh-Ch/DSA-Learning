class Solution {
    public int reverse(int x) {
        int rev = 0;

        while(x != 0) {
            int rem = x % 10;

            if (rev > 214748364 || rev < -214748364) {return 0;}

            rev = rev * 10 + rem;
            x /= 10;
        }

        return rev;
    }
}