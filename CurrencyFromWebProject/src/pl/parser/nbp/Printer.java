package pl.parser.nbp;

public class Printer {
    CreatorURL creatorURL = new CreatorURL();

    public void printAskingOfCurrency(){
        System.out.println("Please enter currency(USD, EUR, CHF, GBP) : ");
    }
    public void printAskingOfStartDate(){
        System.out.println("Please enter start date (in type YYYY-MM-DD): ");
    }
    public void printAskingOfEndDate(){
        System.out.println("Please enter end date(in type YYYY-MM-DD): ");
    }

    public void pirntChosenCurrency(String chosenCurrency){
        System.out.println("Chosen currency is : " + chosenCurrency);
    }

    public void printURL(String currency, String startDate, String endDate){
        System.out.println("Go to: " + creatorURL.creatorURL(currency, startDate, endDate));
    }

    public void printSumOfCurrency(double averageOfCurrency){
        System.out.println("Average of Your chosen Currency is: " + averageOfCurrency);
    }

    public void printStandDeviation(double standardDeviation){
        System.out.println("Standard Deviation is: " + standardDeviation);
    }


}
