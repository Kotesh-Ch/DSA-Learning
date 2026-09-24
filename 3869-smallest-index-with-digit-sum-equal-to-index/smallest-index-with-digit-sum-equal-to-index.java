class Solution {
    private int digitSum(int num) {
        int sum = 0;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
    public int smallestIndex(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int sum = digitSum(nums[i]);
            if(i == sum) {
                res = Math.min(res, i);
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}