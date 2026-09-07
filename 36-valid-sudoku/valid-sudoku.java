class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            int count = 0;
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    set.add(board[i][j]);
                    count++;
                }
            }
            if(count != set.size()) {return false;}
            set.clear();
        }

        for(int i = 0; i < 9; i++) {
            int count = 0;
            for(int j = 0; j < 9; j++) {
                if(board[j][i] != '.') {
                    set.add(board[j][i]);
                    count++;
                }
            }
            if(count != set.size()) {return false;}
            set.clear();
        }

        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 3; c++) {
                int row = r*3;
                int col = c*3;
                int count = 0;

                for(int i = row; i < row+3; i++) {
                    for(int j = col; j < col+3; j++) {
                        if(board[i][j] != '.') {
                            set.add(board[i][j]);
                            count++;
                        }
                    }
                }
                if(count != set.size()) {return false;}
                set.clear();
            }
        }

        return true;
    }
}