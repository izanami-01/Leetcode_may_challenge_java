class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int [] character_count = new int[26];
        for(char c : p.toCharArray()){
            character_count[c - 'a']++;
        }
        int first = 0; 
        int second = 0 ;
        int sizeofp = p.length();
        while(second<s.length()){
            if(character_count[s.charAt(second++)-'a']-->=1) sizeofp--;
            if(sizeofp==0) list.add(first);
            if(second-first ==p.length()&&character_count[s.charAt(first++)-'a']++>=0)
                sizeofp++;
        }
        return list;
    }
}