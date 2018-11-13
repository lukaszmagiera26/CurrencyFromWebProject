package pl.parser.nbp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelectingDataFromTheFile {

public double[] selectingData(String textFromFile){
    String x = new String(textFromFile);
    Pattern pattern = Pattern.compile("\"mid\":(?s)(.{6})}");
    Matcher matcher = pattern.matcher(x);

    int countOfMatch = 0;
    for (int i = 0; i < matcher.regionEnd(); i++) {
        if (matcher.find()){
            countOfMatch ++;
        }
    }
    double[] selectedData = new double[countOfMatch];
    matcher.reset();
    for (int i = 0; i < matcher.regionEnd() ; i++) {
        if (  matcher.find()){
            selectedData[i] += Double.parseDouble(matcher.group(1));
        } }
return selectedData;
}}
