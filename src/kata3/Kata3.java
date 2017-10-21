package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histo = new Histogram(); 
        histo.increment("gmail.com");
        histo.increment("ulpgc.com");
        histo.increment("ulpgc.com");
        histo.increment("ulpgc.com");
        histo.increment("ull.com");
        histo.increment("ull.com");
        histo.increment("google.com");
        histo.increment("google.com");
        
        new HistogramDisplay(histo).execute();  
    }
}