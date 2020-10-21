package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] data;
    
    public Histogram (int[] data){
        this.data = data;
    }
    
    public int[] getData(){
        return data;
    }
    
    Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        for (int i : data) {
           histogram.put(data[i], histogram.containsKey(data[i]) 
                   ? histogram.get(data[i])+1:1); 
        }
        return histogram;
    }
}
