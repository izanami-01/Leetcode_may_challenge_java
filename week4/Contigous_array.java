class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        map.put(0,-1);
        int length = 0;
        int counter = 0;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]==0){
                counter+= -1;
            }
            else{
                counter+= 1;
            }
            if(map.containsKey(counter)){
                length = Math.max(length , i - map.get(counter));
            }
            else{
                map.put(counter,i);
            }
        }
        return length;
    }
}