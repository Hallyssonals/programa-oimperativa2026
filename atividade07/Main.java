package atividade07;

import java.util.Scanner;

public class Main {

    public static long calcularFatorial(int numero) {
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        return fatorial;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        long fatorial = calcularFatorial(numero);

        System.out.println("Fatorial: " + fatorial);

        scanner.close();
    }
}