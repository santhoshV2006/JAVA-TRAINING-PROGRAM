class Solution {

    List<List<String>> all_solutions = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        boolean[] col_used = new boolean[n];
        boolean[] diag1_used  = new boolean[2*n - 1];
        boolean[] diag2_used  = new boolean[2*n - 1];

        backtracking(col_used,diag1_used,diag2_used,0,new ArrayList<>());
        return all_solutions ;    
    }

    void backtracking(boolean[] col_used ,boolean[] diag1_used ,boolean[] diag2_used ,int curr_row ,List<String> curr_solution){

        int n = col_used.length ;

        if(curr_row == n){
            all_solutions.add(new ArrayList<>(curr_solution));
            return ;
        }

        for(int curr_col = 0 ; curr_col < n ; curr_col++){

            int d1 = curr_row + curr_col;
            int d2 = curr_row - curr_col + n - 1;

            if(!col_used[curr_col] && !diag1_used[d1] && !diag2_used[d2]){
                
                StringBuilder sb = new StringBuilder();
                for(int i = 0 ; i <  n ; i++){
                    if(i == curr_col){
                        sb.append("Q");
                    }
                    else{
                        sb.append(".");
                    }
                }
                curr_solution.add(sb.toString());
                col_used[curr_col] = true ;
                diag1_used[d1] = true ;
                diag2_used[d2] = true ;

                backtracking(col_used,diag1_used,diag2_used,curr_row+1,curr_solution);

                curr_solution.remove(sb.toString());
                col_used[curr_col] = false ;
                diag1_used[d1] = false ;
                diag2_used[d2] = false ;
            }
        }
    }
}