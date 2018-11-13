package pl.parser.nbp;

public class CreatorURL {

    URLHandle urlHandle = new URLHandle();
    private String URL;

public String creatorURL(String currency, String startDate, String endDate){
    URL = urlHandle.URLHandle(currency, startDate, endDate);
   return URL;


}


}
