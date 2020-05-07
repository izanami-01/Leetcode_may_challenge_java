class Solution {
    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        // for(int i = 0 ; i<J.length();i++)
        //     for(int j = 0 ; j<S.length();j++)
        //         if(J.charAt(i)==S.charAt(j)){
        //             counter++;
        //         }
        Set<Character> set = new HashSet<>();
        for(char c : J.toCharArray())
            set.add(c);
        
        for(char d : S.toCharArray()){
            if(set.contains(d)){
                counter++;
            }
        }
        return counter;
    }
}