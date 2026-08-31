package atividade06;

import java.util.Scanner;

public class Main {

    public static double calcularPotenciaHP(double massa, double altura, double tempo) {
        double gravidade = 9.81;

        double potenciaWatts = (massa * gravidade * altura) / tempo;
        double potenciaHP = potenciaWatts / 745.6999;

        return potenciaHP;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Massa: ");
        double massa = scanner.nextDouble();

        System.out.print("Altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Tempo: ");
        double tempo = scanner.nextDouble();

        double potenciaHP = calcularPotenciaHP(massa, altura, tempo);

        System.out.printf("Potência necessária: %.3f hp%n", potenciaHP);

        scanner.close();
    }
}