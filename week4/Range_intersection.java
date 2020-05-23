class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List <int []> answer = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<A.length && j < B.length){
            int [] p = A[i];
            int [] q = B[j];
                         if(p[1] <q[0]) i++;
                         else if(q[1]<p[0])j++;
                         else { 
                             int start = Math.max(p[0],q[0]);
                             int end = Math.min(p[1] , q[1]);
                             answer.add(new int[]{start,end});
                                        if(p[1]<q[1]) i++;
                                           else if(p[1] >= q[1])j++;
                         }
         }
        return answer.toArray(new int[answer.size()][]);
    } 
}