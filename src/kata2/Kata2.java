package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = new int[] {0,1,2,3,4,5,6,7,8,9,0,3,6,9,0};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int i : data) {
           histogram.put(data[i], histogram.containsKey(data[i]) 
                   ? histogram.get(data[i])+1:1); 
        }
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        } 
    }
    
}
