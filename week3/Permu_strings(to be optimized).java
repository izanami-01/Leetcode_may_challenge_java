class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len_s1 = s1.length();
        for(int i = 0 ; i<=s2.length()-len_s1;i++){
            char c[] = s2.substring(i,i+len_s1).toCharArray();
            char d[] = s1.toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);
            if(String.valueOf(d).equals(String.valueOf(c))){
                return true;
            }
        }
        return false;
    }
}