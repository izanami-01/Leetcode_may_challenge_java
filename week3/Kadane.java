//Note -  for all negative elements in an array I used directly the m=max values of an array
import java.util.Arrays;
class Solution {
    public int maxSubarraySumCircular(int[] A) {
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
        int max_ending_here = 0, max_so_far = 0;
        for(int i = 0 ; i<arr.length;i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_ending_here<0)
             max_ending_here = 0;
              if(max_so_far<max_ending_here){
                  max_so_far = max_ending_here;
              }

          
        }
           if(max_so_far==0){
             max_so_far = Arrays.stream(arr).max().getAsInt(); 
         }
        return max_so_far;
    }
}