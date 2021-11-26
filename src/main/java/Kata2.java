
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
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();

        for (String i : histogr.keySet()) {
            System.out.println(i + "==>" + histogr.get(i));
        }
        
    }
    
}
