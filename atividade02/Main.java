package atividade02;

import java.util.Scanner;

public class Main {

    public static double maiorAltura(double[] alturas) {
        double maior = alturas[0];

        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] > maior) {
                maior = alturas[i];
            }
        }

        return maior;
    }

    public static double menorAltura(double[] alturas) {
        double menor = alturas[0];

        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] < menor) {
                menor = alturas[i];
            }
        }

        return menor;
    }

    public static double mediaAlturaHomens(double[] alturas, int[] sexos) {
        double soma = 0;
        int quantidadeHomens = 0;

        for (int i = 0; i < alturas.length; i++) {
            if (sexos[i] == 2) {
                soma += alturas[i];
                quantidadeHomens++;
            }
        }

        if (quantidadeHomens == 0) {
            return 0;
        }

        return soma / quantidadeHomens;
    }

    public static int quantidadeMulheres(int[] sexos) {
        int quantidade = 0;

        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 1) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] alturas = new double[10];
        int[] sexos = new int[10];

        for (int i = 0; i < 10; i++) {
            sexos[i] = scanner.nextInt();
            alturas[i] = scanner.nextDouble();
        }

        double maior = maiorAltura(alturas);
        double menor = menorAltura(alturas);
        double mediaHomens = mediaAlturaHomens(alturas, sexos);
        int mulheres = quantidadeMulheres(sexos);

        System.out.printf("Maior altura: %.2f m%n", maior);
        System.out.printf("Menor altura: %.2f m%n", menor);
        System.out.printf("Média de altura dos homens: %.2f m%n", mediaHomens);
        System.out.println("Número de mulheres: " + mulheres);

        scanner.close();
    }
}