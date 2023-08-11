package temperatureConvrter;
import java.util.Scanner;
public class TemperatureConverterApp {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE TEMPERATURE IN FAHRENHEIT:");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double c=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(c);
		
		
		
		
		
				 {
	}

	}}
