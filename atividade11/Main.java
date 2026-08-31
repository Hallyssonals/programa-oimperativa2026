package atividade11;

import java.util.Scanner;

public class Main {

    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }

    public static int contarPares(int[] numeros) {
        int quantidade = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return (double) soma / numeros.length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int maior = encontrarMaior(numeros);
        int menor = encontrarMenor(numeros);
        int quantidadePares = contarPares(numeros);
        double media = calcularMedia(numeros);

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Quantidade de pares: " + quantidadePares);
        System.out.println("Média: " + media);

        scanner.close();
    }
}