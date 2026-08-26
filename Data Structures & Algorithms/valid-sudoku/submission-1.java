class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> col = new HashMap<>();
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<String, Set<Character>> sqr = new HashMap<>();

        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                String sqrKey = (i/3) + "," + (j/3);
                
                if(row.computeIfAbsent(i, k-> new HashSet<>()).contains(board[i][j]) ||
                   col.computeIfAbsent(j, k-> new HashSet<>()).contains(board[i][j]) ||
                   sqr.computeIfAbsent(sqrKey, k-> new HashSet<>()).contains(board[i][j])){
                    return false;
                }

                row.get(i).add(board[i][j]);
                col.get(j).add(board[i][j]);
                sqr.get(sqrKey).add(board[i][j]);
            }
        }
        return true;
    }
}
