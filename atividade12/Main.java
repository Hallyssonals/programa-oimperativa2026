package atividade12;

import java.util.Scanner;

public class Main {

    public static int contarNumeros(int quantidade) {
        return quantidade;
    }

    public static int calcularSoma(int[] numeros, int quantidade) {
        int soma = 0;

        for (int i = 0; i < quantidade; i++) {
            soma += numeros[i];
        }

        return soma;
    }

    public static double calcularMedia(int[] numeros, int quantidade) {
        int soma = 0;

        for (int i = 0; i < quantidade; i++) {
            soma += numeros[i];
        }

        return (double) soma / quantidade;
    }

    public static int encontrarMaior(int[] numeros, int quantidade) {
        int maior = numeros[0];

        for (int i = 1; i < quantidade; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static int encontrarMenor(int[] numeros, int quantidade) {
        int menor = numeros[0];

        for (int i = 1; i < quantidade; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }

    public static int contarPares(int[] numeros, int quantidade) {
        int pares = 0;

        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        return pares;
    }

    public static int contarImpares(int[] numeros, int quantidade) {
        int impares = 0;

        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] % 2 != 0) {
                impares++;
            }
        }

        return impares;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[100];
        int quantidade = 0;

        int numero = scanner.nextInt();

        while (numero != -1) {
            numeros[quantidade] = numero;
            quantidade++;

            numero = scanner.nextInt();
        }

        int quantidadeNumeros = contarNumeros(quantidade);
        int soma = calcularSoma(numeros, quantidade);
        double media = calcularMedia(numeros, quantidade);
        int maior = encontrarMaior(numeros, quantidade);
        int menor = encontrarMenor(numeros, quantidade);
        int pares = contarPares(numeros, quantidade);
        int impares = contarImpares(numeros, quantidade);

        System.out.println("Quantidade de números: " + quantidadeNumeros);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);

        scanner.close();
    }
}