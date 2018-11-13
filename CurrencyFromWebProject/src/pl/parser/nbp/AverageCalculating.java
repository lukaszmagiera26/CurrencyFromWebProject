package pl.parser.nbp;

public class AverageCalculating {
    public  double countLines(double []curencyData) {
        int curencyDatalength = curencyData.length;
        double roundedAverageOfCurrencyData;
        double sumOfCurrencyData = 0;
        double averageOfCurrencyData = 0;

        for (int i = 0; i < curencyDatalength ; i++) {
            sumOfCurrencyData += curencyData[i];
//            System.out.println(i+1 + " Currency: "+ curencyData[i]);
        }
        averageOfCurrencyData = sumOfCurrencyData / curencyDatalength;
        roundedAverageOfCurrencyData = (double)Math.round(averageOfCurrencyData * 10000d) / 10000d;
        return  roundedAverageOfCurrencyData;
        }
}