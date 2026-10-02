class Solution {
    boolean checkRow(char[][] board, int x ,int y, char ch)
    {
        for(int j=0;j<9;j++)
        {
            if(j==y)
            {
                continue;
            }
            else 
            {
                if (board[x][j]==ch) {
                    return false;
                }
            }
        }
        return true;
    }
    boolean checkCol(char[][] board, int x ,int y, char ch)
    {
        for(int i=0;i<9;i++)
        {
            if(i==x)
            {
                continue;
            }
            else 
            {
                if (board[i][y]==ch) {
                    return false;
                }
            }
        }
        return true;
    }
    boolean checkBox(char[][] board, int x, int y, char ch) {

        // Find the top-left corner of the 3x3 box
        int startRow = (x / 3) * 3;
        int startCol = (y / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {

                if (i == x && j == y) {
                    continue;
                }

                if (board[i][j] == ch) {
                    return false;
                }
            }
        }

        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        if(m!=9 || n!=9)
        {
            return false;
        }
        for(int i=0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                 if (board[i][j] == '.') {
                    continue;
                }

                if(!(checkRow(board,i,j,board[i][j]) && (checkCol(board,i,j,board[i][j])) && checkBox(board,i,j,board[i][j]) ))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
