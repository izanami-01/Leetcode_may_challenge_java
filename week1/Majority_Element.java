import java.util.Collections;
import java.util.Map;
import java.util.LinkedHashMap;
public class Solution {
    public static void main(String args[]){
        int [] nums = {3,3,4};
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int c : nums){
            if(map.containsKey(c)){
                int count = (int)map.get(c);    
                count++;
                map.put(c, count);
            }
            else{
                map.put(c, 1);
            }
        }

        int maxValue = Collections.max(map.values());
          for(Map.Entry<Integer,Integer> entry : map.entrySet()){
              if(maxValue==entry.getValue()){
                  System.out.println(entry.getKey());
              }
          }
}
}