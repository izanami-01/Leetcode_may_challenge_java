class Solution {
    public int[] countBits(int num) {
        int arr[] = new int[num+1];
        for(int i = 0 ; i<=num ;i++){
            //int a = countNumber(i);
             //arr[i] = a;
            arr[i] = arr[i >> 1] + i % 2;
        }
        
        return arr;
    }
    
    
    // public int countNumber(int nums){
    //     long number = Long.parseLong(Long.toBinaryString(nums));
    //     long c = 0;
    //     while (number > 0)  
    // { 
    //     if (number % 10 == 1) 
    //         c++; 
    //     number = number / 10; 
    // }     
    //     int p = (int)c;
    //     return p;
    // }
}