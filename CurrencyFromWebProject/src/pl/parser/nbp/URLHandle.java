package pl.parser.nbp;

public class URLHandle {
    private String URL;

    public String URLHandle(String Currency, String startDate, String endDate){
        URL = "http://api.nbp.pl/api/exchangerates/rates/A/"+ Currency + "/" + startDate + "/" + endDate ;
        return URL;
    }
}
