class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        List<List<Integer>> list1 = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        int n = img1.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(img1[i][j] == 1) {list1.add(Arrays.asList(i,j));}
                if(img2[i][j] == 1) {list2.add(Arrays.asList(i,j));}
            }
        }

        int[][] counts = new int[n * 2][n * 2];
        int res = 0;

        for(List<Integer> l1 : list1) {
            for(List<Integer> l2 : list2) {
                int dx = l2.get(0) - l1.get(0) + n;
                int dy = l2.get(1) - l1.get(1) + n;
                counts[dx][dy]++;
                res = Math.max(res, counts[dx][dy]);
            }
        }

        return res;
    }
}