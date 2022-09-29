package kata.pkg2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {1, 6, 2, 8, 3, 8, 2, 7, 3, 4, 2, 9, 0, 6, 4};
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        Map<Integer, Integer> histogram = histogramGenerator.getHistogram();
        
        
        for(Map.Entry<Integer, Integer> entry: histogram.entrySet()){
            System.out.println(entry.getKey() + "==> " + entry.getValue());
        }
        
    }
    
}
