class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        if(n>9)return ans;
        char[][] queen=new char[n][n];
        for(char[] Qs:queen)
        {
            Arrays.fill(Qs,'.');
        }
        backtrack(0,ans,queen);
        return ans;
    }
    public static void backtrack(int row,List<List<String>> ans,char[][] queen)
    {
        if(row==queen.length){
        ans.add(construct(queen));
        return;}
      for(int col=0;col<queen.length;col++)
      {
      if(isSafe(queen,row,col))
      {
        queen[row][col]='Q';
        backtrack(row+1,ans,queen);
        queen[row][col]='.';
      }
    }
  }
    public static boolean isSafe(char[][] queen, int row, int col) {
        // check column
        for (int i = 0; i < row; i++) {
            if (queen[i][col] == 'Q') return false;
        }
        // check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (queen[i][j] == 'Q') return false;
        }
        // check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < queen.length; i--, j++) {
            if (queen[i][j] == 'Q') return false;
        }
        return true;
    }
     public static List<String> construct(char[][] queen) {
        List<String> res = new ArrayList<>();
        for (char[] row : queen) {
            res.add(new String(row));
        }
        return res;
    }
}