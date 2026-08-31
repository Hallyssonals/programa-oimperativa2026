package atividade03;

import java.util.Scanner;

public class Main {

    public static double calcularMediaSalarial(double[] salarios) {
        double soma = 0;

        for (int i = 0; i < salarios.length; i++) {
            soma += salarios[i];
        }

        return soma / salarios.length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadeFuncionarios = scanner.nextInt();

        double[] salarios = new double[quantidadeFuncionarios];

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            salarios[i] = scanner.nextDouble();
        }

        double media = calcularMediaSalarial(salarios);

        System.out.printf("Média salarial: %.2f%n", media);

        scanner.close();
    }
}