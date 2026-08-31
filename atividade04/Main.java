package atividade04;

import java.util.Scanner;

public class Main {

    public static int calcularQuantidadeAzulejos(
            double alturaParede,
            double larguraParede,
            double alturaAzulejo,
            double larguraAzulejo) {

        double areaParede = alturaParede * larguraParede;
        double areaAzulejo = alturaAzulejo * larguraAzulejo;

        double quantidade = areaParede / areaAzulejo;

        return (int) Math.ceil(quantidade);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura da parede: ");
        double alturaParede = scanner.nextDouble();

        System.out.print("Largura da parede: ");
        double larguraParede = scanner.nextDouble();

        System.out.print("Altura do azulejo: ");
        double alturaAzulejo = scanner.nextDouble();

        System.out.print("Largura do azulejo: ");
        double larguraAzulejo = scanner.nextDouble();

        int quantidade = calcularQuantidadeAzulejos(
                alturaParede,
                larguraParede,
                alturaAzulejo,
                larguraAzulejo
        );

        System.out.println("Quantidade de azulejos necessários: " + quantidade);

        scanner.close();
    }
}