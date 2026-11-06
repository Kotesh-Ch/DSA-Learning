class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int ele1 = A[i];
            int ele2 = B[i];
            int count = 0;

            if (ele1 == ele2) count = 1;

            if (hmap.containsKey(ele1)) count++;

            if (hmap.containsKey(ele2)) count++;

            if (i > 0) count += ans[i - 1];

            ans[i] = count;

            hmap.put(ele1, hmap.getOrDefault(ele1, 0) + 1);
            hmap.put(ele2, hmap.getOrDefault(ele2, 0) + 1);
        }
        return ans;
    }
}