package atividade01;

import java.util.Scanner;

public class Main {

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusParaReaumur(double celsius) {
        return celsius * 0.8;
    }

    public static double celsiusParaRankine(double celsius) {
        return celsius * 1.8 + 491.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusParaFahrenheit(celsius);
        double kelvin = celsiusParaKelvin(celsius);
        double reaumur = celsiusParaReaumur(celsius);
        double rankine = celsiusParaRankine(celsius);

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
        System.out.println("Réaumur: " + reaumur);
        System.out.println("Rankine: " + rankine);

        scanner.close();
    }
}