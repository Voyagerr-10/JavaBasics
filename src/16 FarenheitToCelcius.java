//16: Create a program to convert Fahrenheit to Celcius
//   C = (F - 32) * 5 / 9

import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Fahrenheit to Celsius Converter-----");

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        sc.close();

        double c = (f - 32) * 5 / 9;
        System.out.println("Temperature in Celsius = " + c);
    }
}