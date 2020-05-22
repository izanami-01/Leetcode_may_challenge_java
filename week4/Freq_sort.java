class Solution {
    public String frequencySort(String s) {
        HashMap <Character, Integer> map   = new HashMap<>(); 
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                int count = (int)map.get(c);
                count++;
                map.put(c, count);
            }
            else{
                map.put(c, 1);
            }
        }
        List<Map.Entry<Character, Integer> > list = 
        new LinkedList<Map.Entry<Character, Integer> >(map.entrySet()); 

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() { 
            public int compare(Map.Entry<Character, Integer> o1,  
                               Map.Entry<Character, Integer> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
        String a = "";
       // Collections.sort(list,Collections.reverseOrder());
        for(Map.Entry<Character, Integer> aa : list){
             for(int i = aa.getValue() ; i>0;--i){
                 a = a.concat(String.valueOf(aa.getKey()));
             }
        }
        return a;
    }
}