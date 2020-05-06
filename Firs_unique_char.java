import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;
public class Solutions {
    //public void firstUniqChar(String s) 
    public static void main(String args[]){
        String s = "dddccdbba";
        Map<Character,Integer> map = new LinkedHashMap<>();
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
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue()==1){
                    char c = entry.getKey();
                    System.out.println(s.indexOf(c));
                    break;
                }
        }
        //return -1;
    }
}