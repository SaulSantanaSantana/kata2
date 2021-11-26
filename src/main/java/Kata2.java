
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author saul
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        final int data[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6};
        HashMap<Integer, Integer> histogram = new HashMap();
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
            
        }
        
        for (int i : histogram.keySet()) {
            System.out.println(i + "==>" + histogram.get(i));
        }
        
    }
    
}
