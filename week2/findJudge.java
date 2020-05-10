class Solution {
    public int findJudge(int N, int[][] trust) {
        int result [] = new int[N+1];
        
        for(int [] arr: trust){
            result[arr[0]]--;
            result[arr[1]]++;
        }
        
        
        for(int i = 1; i<=N ;i++){
            if(result[i]==N-1)return i;
        }
        return -1;
    }
}