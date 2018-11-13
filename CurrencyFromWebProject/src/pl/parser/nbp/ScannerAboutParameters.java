package pl.parser.nbp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ScannerAboutParameters {
    Printer printer = new Printer();
    private String currencyURL;
    private String startDate;
    private String endDate;
    Scanner sc = new Scanner(System.in);

    public String scannerOfCurrency(){
        printer.printAskingOfCurrency();
       do {
           currencyURL = sc.nextLine();  }
        while( !currencyURL.equals("USD" )&& !currencyURL.equals("CHF")  && !currencyURL.equals("GBP") && !currencyURL.equals( "EUR") );
        return currencyURL;
    }

    public String scannerOfStartDate() throws ParseException {
        printer.printAskingOfStartDate();

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        System.out.println("Enter date and time in the format yyyy-MM-dd");
        System.out.println("For example, it is now " + format.format(new Date()));
        Date date = null;
        String startDate  = "";
       while (date == null) {
            String line = sc.nextLine();
            try { date = format.parse(line);
            } catch (ParseException e) {
                System.out.println("Sorry, that's not valid. Please try again.");
            }
            startDate = line;
       }
        return startDate;
    }

    public String scannerOfEndDate(){
        printer.printAskingOfEndDate();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        System.out.println("Enter date and time in the format yyyy-MM-dd");
        System.out.println("For example, it is now " + format.format(new Date()));
        Date date = null;
        String endDate  = "";

        while (date == null) {
            String line = sc.nextLine();
            try { date = format.parse(line);
            } catch (ParseException e) {
                System.out.println("Sorry, that's not valid. Please try again.");
            }
            endDate = line;
        }
        return endDate;
    }
}
