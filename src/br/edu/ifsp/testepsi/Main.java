package br.edu.ifsp.testepsi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("  QUESTIONÁRIO PSICOLÓGICO SIMPLES");
        System.out.println("  (A = 1 ponto | B = 5 pontos | C = 10 pontos)");
        System.out.println("=====================================\n");

        System.out.println("===== TESTE DE DEPRESSÃO : =====");
        int[] respostasDep = aplicarQuestionario(sc, new String[]{
                "1) Como está sua motivação diária?",
                "2) Como tem sido seu interesse por atividades antes prazerosas?",
                "3) Como você avalia sua disposição física?",
                "4) Como tem sido sua capacidade de concentração?",
                "5) Como tem sido seu humor nos últimos dias?"
        });
        TestePsicologico testeDep = new Depressao(respostasDep);

        System.out.println("\n===== TESTE DE ANSIEDADE =====");
        int[] respostasAns = aplicarQuestionario(sc, new String[]{
                "1) Com que frequência você sente nervosismo?",
                "2) Tem dificuldade em relaxar?",
                "3) Sente que algo ruim pode acontecer sem motivo aparente?",
                "4) Se sente inquieto com frequência?",
                "5) Tem dificuldade de controlar preocupações?"
        });
        TestePsicologico testeAns = new Ansiedade(respostasAns);

        System.out.println("\n=====================================");
        System.out.println("              RESULTADOS");
        System.out.println("=====================================\n");

        System.out.println("--- DEPRESSÃO ---");
        System.out.print(testeDep.resumo());

        System.out.println("\n--- ANSIEDADE ---");
        System.out.print(testeAns.resumo());

        sc.close();
    }

    private static int[] aplicarQuestionario(Scanner sc, String[] perguntas) {
        int[] respostas = new int[perguntas.length];

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.println("A) Pouco / Quase nunca");
            System.out.println("B) Moderado / Às vezes");
            System.out.println("C) Intenso / Frequentemente");
            System.out.print("Escolha (A/B/C): ");

            String escolha;
            while (true) {
                escolha = sc.next().trim().toUpperCase();
                if (escolha.equals("A")) { respostas[i] = 1; break; }
                if (escolha.equals("B")) { respostas[i] = 5; break; }
                if (escolha.equals("C")) { respostas[i] = 10; break; }
                System.out.print("Entrada inválida! Digite A, B ou C: ");
            }
            System.out.println();
        }

        return respostas;
    }
}
