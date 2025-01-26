class Solution {
    public static void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
    private static boolean helper(char[][] board, int r, int c){
        if(r == 9) return true;
        if(c == 9) return helper(board, r+1, 0);
        if(board[r][c] != '.') return helper(board, r, c+1);
        for(char num = '1'; num <= '9'; num++){
            if(isSafe(board, r, c, num)){
                board[r][c] = num;
                if(helper(board, r, c+1)) return true;
                board[r][c] = '.';
            }
        }
        return false;
    }
    private static boolean isSafe(char[][] board, int r, int c, char num){
        // ROW Check
        for(int row = 0; row < board.length; row++){
            if(board[row][c] == num) return false;
        }
        // COL check
        for(int col = 0; col < board[0].length; col++){
            if(board[r][col] == num) return false;
        }
        // SQUARE Check
        r = r - r % 3;
        c = c - c % 3;
        for(int row = r; row < r + 3; row++){
            for(int col = c; col < c + 3; col++){
                if(board[row][col] == num) return false;
            }
        }
        return true;
    }
}