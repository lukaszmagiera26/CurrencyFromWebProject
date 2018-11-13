package pl.parser.nbp;

public class StandardDeviationCalc {
    private int n;
    private double sum;
    private double sumsq;
    private double roundedStndDeviation;

    public synchronized double addValue(double []x) {
        for (int i = 0; i <x.length ; i++) {
            ++this.n;
            this.sum += x[i];
            this.sumsq += x[i]*x[i];
        }
        double deviation = 0.0;
        if (this.n > 1) {
            deviation = Math.sqrt((this.sumsq - this.sum*this.sum/this.n)/(this.n-1));
            roundedStndDeviation = (double)Math.round(deviation * 10000d) / 10000d;
        }
        return roundedStndDeviation;
    }
}

