class Solution {
    public int countSquares(int[][] matrix) {
        int sizeofMatrix = matrix.length;
        int size = matrix[0].length;
        int counter[] = new int[size];
        int tl =0 ;
        int answer =0;
        
          for(int i = 0 ; i<sizeofMatrix ; i++){
              for(int j =0 ; j<size ; j++){
                  if(matrix[i][j]==1){
                      int t = i == 0 ? 0 : counter[j];
                      int l = j==0 ? 0 : counter[j-1];
                      counter[j] = 1 + Math.min(Math.min(t , l) , tl);
                      answer += counter[j];
                      tl = (j==size-1) ? 0 : t;
                  }
                  else
                      counter[j] = 0;
              }
          }
        return answer;
    }
}