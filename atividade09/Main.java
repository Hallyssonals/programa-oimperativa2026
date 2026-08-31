package atividade09;

import java.util.Scanner;

public class Main {

    public static double calcularMediaAluno(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String determinarSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static double calcularMediaTurma(double[] medias) {
        double soma = 0;

        for (int i = 0; i < medias.length; i++) {
            soma += medias[i];
        }

        return soma / medias.length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadeAlunos = scanner.nextInt();

        double[] medias = new double[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {

            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double nota3 = scanner.nextDouble();

            medias[i] = calcularMediaAluno(nota1, nota2, nota3);

            String situacao = determinarSituacao(medias[i]);

            System.out.printf(
                "Aluno %d - Média: %.1f - %s%n",
                i + 1,
                medias[i],
                situacao
            );
        }

        double mediaGeral = calcularMediaTurma(medias);

        System.out.printf("Média geral da turma: %.1f%n", mediaGeral);

        scanner.close();
    }
}