import java.math.BigDecimal;
import java.math.RoundingMode;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        double fahrenheitVal = (fahrenheit - 32) * ((double) 5 / 9);
        BigDecimal fahrenheitSanitised = new BigDecimal(fahrenheitVal).setScale(2, RoundingMode.DOWN);
        return fahrenheitSanitised.doubleValue();
    }
    public double celsiusToFahrenheit(double celsius) {
        double celsiusVal = (celsius * 9 / 5) + 32;
        BigDecimal celsiusSanitised = new BigDecimal(celsiusVal).setScale(2, RoundingMode.DOWN);
        return celsiusSanitised.doubleValue();
    }
    public double kelvinToCelsius(double kelvin) {
        double celsiusVal = kelvin - 273.15;
        BigDecimal celsiusSanitised =  new BigDecimal(celsiusVal).setScale(2, RoundingMode.DOWN);
        return celsiusSanitised.doubleValue();
    }
    public boolean isExtremeTemperature(double celsius) {
        if (celsius >= 50 || celsius <= -40) {
            return true;
        }
        return false;
    }
    /*
    public static void main(String[] args) {
        TemperatureConverter tempConverter = new TemperatureConverter();
        System.out.println(tempConverter.fahrenheitToCelsius(27));

    }*/
}
