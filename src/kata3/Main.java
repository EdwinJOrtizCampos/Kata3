package kata3;
import kata3.HistogramDisplay;

public class Main {
    public static void main(String[] args){
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("rojo.es");
        histogram.increment("azul.es");
        histogram.increment("azul.es");
        histogram.increment("azul.es");
        histogram.increment("rojo.es");
        
        new HistogramDisplay(histogram).execute();
    }
}
