
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
        Integer[] data = {1,100,4,2,4,1,3,5,9,100,100};
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();

        for (int i : histogr.keySet()) {
            System.out.println(i + "==>" + histogr.get(i));
        }
        
    }
    
}
