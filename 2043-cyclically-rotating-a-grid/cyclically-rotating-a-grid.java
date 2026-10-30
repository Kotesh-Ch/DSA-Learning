class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < Math.min(m, n) / 2; i++) {
            int newR = m - i;
            int newC = n - i;
            List<Integer> temp = new ArrayList<>();

            for (int j = i; j < newC; j++) {
                temp.add(grid[i][j]);
            }

            for (int j = i + 1; j < newR; j++) {
                temp.add(grid[j][newC - 1]);
            }

            for (int j = newC - 2; j >= i; j--) {
                temp.add(grid[newR - 1][j]);
            }

            for (int j = newR - 2; j > i; j--) {
                temp.add(grid[j][i]);
            }

            int tempSize = temp.size();
            int t = k % tempSize;

            for (int j = i; j < newC; j++) {
                grid[i][j] = temp.get(t % tempSize);
                t++;
            }

            for (int j = i + 1; j < newR; j++) {
                grid[j][newC - 1] = temp.get(t % tempSize);
                t++;
            }

            for (int j = newC - 2; j >= i; j--) {
                grid[newR - 1][j] = temp.get(t % tempSize);
                t++;
            }

            for (int j = newR - 2; j > i; j--) {
                grid[j][i] = temp.get(t % tempSize);
                t++;
            }
        }
        return grid;
    }
}