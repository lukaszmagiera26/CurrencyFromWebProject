    package pl.parser.nbp;

    import java.io.IOException;
    import java.text.ParseException;


    public class Runner {
    ScannerAboutParameters scannerAboutParameters = new ScannerAboutParameters();
    SelectingDataFromTheFile selectingDataFromTheFile = new SelectingDataFromTheFile();
    CreatorURL creatorURL = new CreatorURL();
    UrlToText urlToText = new UrlToText();
    AverageCalculating averageCalculating = new AverageCalculating();
    StandardDeviationCalc standardDeviationCalc = new StandardDeviationCalc();

    Printer printer = new Printer();
    private String scnOfCurrency;
    private String startDate;
    private String endDate;


    public void main() throws IOException, ParseException {
        scnOfCurrency = scannerAboutParameters.scannerOfCurrency();
        printer.pirntChosenCurrency(scnOfCurrency);
        startDate = scannerAboutParameters.scannerOfStartDate();
        endDate = scannerAboutParameters.scannerOfEndDate();
        printer.printURL(scnOfCurrency, startDate, endDate);

        printer.printSumOfCurrency( averageCalculating.countLines( selectingDataFromTheFile.selectingData
                (urlToText.urlToText(creatorURL.creatorURL(scnOfCurrency, startDate, endDate))) ) );

        printer.printStandDeviation( standardDeviationCalc.addValue(  selectingDataFromTheFile.selectingData
            (urlToText.urlToText(creatorURL.creatorURL(scnOfCurrency, startDate, endDate))) )    );

}
    }
