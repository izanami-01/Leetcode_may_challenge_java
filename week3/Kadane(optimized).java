class Solution {
    public int maxSubarraySumCircular(int[] A) {
       // int max_value_neg = Arrays.stream(A).max().getAsInt();
     //   if(max_value_neg<0)return max_value_neg;
        int max_circ = 0;
        int kadane_value = kadanes(A);
        for(int i=0; i<A.length;i++){
            max_circ += A[i];
            A[i] = -A[i];
        }
        max_circ = max_circ + kadanes(A);
       int result = max_circ>kadane_value?max_circ : kadane_value;
                if(result==0){
           result = kadane_value;
        }
        return result;
    }
    
    
    public int kadanes(int [] arr){
        int max_ending_here = arr[0], max_so_far = arr[0];
        for(int i = 1 ; i<arr.length;i++){
            //max_ending_here = max_ending_here + arr[i];
           // if(max_ending_here<0)
           //  max_ending_here = 0;
            //  if(max_so_far<max_ending_here){
              //    max_so_far = max_ending_here;
             max_ending_here = Math.max(arr[i] , max_ending_here+arr[i]);
            max_so_far = Math.max(max_so_far , max_ending_here);
             }

          
           //if(max_so_far==0){
          // max_so_far = Arrays.stream(arr).max().getAsInt(); 
       //}
        return max_so_far;
}
}