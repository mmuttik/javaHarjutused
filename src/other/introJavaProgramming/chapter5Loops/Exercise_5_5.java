package other.introJavaProgramming.chapter5Loops;

/**
 * Created by esta on 25/11/15.
 */
public class Exercise_5_5 {
    public static void main(String[] args) {

        System.out.printf("%-10s %-20s %10s %20s %n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");

        int fahrenheitTwenty = 15;

        for (int i = 0; i < 11; i+=2) {
            celsiusToFahrenheit(i);
            System.out.printf("|");
            fahrenheitToCelsius(fahrenheitTwenty+=5);
            System.out.println();
        }
    }
        // Convert Celsius to Fahrenheit
        public static double celsiusToFahrenheit(int celsius) {

            double fahrenheit = (double) celsius * 9 / 5 + 32;

            String fahrenheitString = String.format("%.3f", fahrenheit);

            System.out.printf("%-10s %-20s", celsius, fahrenheitString);

            return fahrenheit;
        }

        // Convert Fahrenheit to Celsius
        public static double fahrenheitToCelsius(int fahrenheit) {

            double celsius = ((double) fahrenheit - 32) * 5/9;

            celsius = Math.round(celsius * 1000);

            celsius = celsius / 1000;

            System.out.printf("%10s %20s", fahrenheit, celsius);

            return celsius;
        }
    }
