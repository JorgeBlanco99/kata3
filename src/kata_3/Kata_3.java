package kata_3;

/**
 *
 * @author jorge
 */
public class Kata_3 {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("yahoo.es");
        histogram.increment("gmail.com");
        histogram.increment("yahoo.es");
        histogram.increment("ulpgc.es");
        histogram.increment("alu.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("yahoo.es");
        histogram.increment("outlook.es");
        histogram.increment("ulpgc.es");
        histogram.increment("outlook.es");
        
        new HistogramDisplay(histogram).execute();

    }
}
