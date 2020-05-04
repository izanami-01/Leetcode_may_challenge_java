class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         HashMap <Character, Integer> map   = new HashMap<>(); 
        for(char c : magazine.toCharArray()){
            if(map.containsKey(c)){
                int count = (int)map.get(c);
                count++;
                map.put(c, count);
            }
            else{
                map.put(c, 1);
            }
        }
        for(char c : ransomNote.toCharArray()){
            if(map.containsKey(c)){
                int count  = (int)map.get(c);
                count--;
                if(count<0){
                    return false;
                }
                else{
                    map.put(c,count);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}