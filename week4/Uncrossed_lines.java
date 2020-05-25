class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int a = A.length;
        int b = B.length;
        int [][] d_p = new int[a+1][b+1];
        for(int i = 1 ; i<a+1 ; ++i)
            for(int j = 1 ; j < b+1 ; ++j){
                d_p[i][j] = A[i-1]==  B[j-1]? 1 + d_p[i-1][j-1] : Math.max(d_p[i][j-1] , d_p[i-1][j]);
            }
        return d_p[a][b];
    }
}