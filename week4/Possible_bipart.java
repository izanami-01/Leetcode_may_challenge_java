class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        if(N==1)
            return true;
        int bip[] = new int[N];
        Arrays.fill(bip,-1);
        ArrayList<Integer> [] arr = new ArrayList[N];
        
        for(int i = 0 ; i<N ;i++){
            arr[i] = new ArrayList();
        }
        
        for(int [] a : dislikes){
            arr[a[0]-1].add(a[1]-1);
            arr[a[1]-1].add(a[0]-1);
        }
        for(int i = 0 ; i<N;i++){
            if(bip[i]==-1&&!dfs(arr,bip,i,0))
                return false;
        }
        return true;
        
    }
    
    private boolean dfs(ArrayList<Integer>[] arr ,int bip[] , int b , int val ){
        if(bip[b]==-1)
            bip[b] = val;
        else
            return bip[b] == val;
        
        for(int j : arr[b])
            if(!dfs(arr,bip , j ,1-val))
                return false;
        
        return true;
    }
}