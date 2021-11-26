
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
        Histogram histo = new Histogram();
        Map<Integer,Integer> histogr = histo.getHistogram();

        for (int i : histogr.keySet()) {
            System.out.println(i + "==>" + histogr.get(i));
        }
        
    }
    
}
