
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saul
 */
public class Histogram<T> {
    
    private final T[] data;

    public Histogram(T[] data) {
        
        this.data = data;
  
    }

    public T[] getData() {
        return data;
    }
    
    public Map<T, Integer> getHistogram(){
    
        HashMap<T, Integer> histogram = new HashMap<>();
        
        for (T key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        return histogram;
        
    }
    
}
