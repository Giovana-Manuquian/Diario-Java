package br.senai.sp.diario;

import java.util.Scanner;

public class Diario {
    public static void main(String[] args) {

        /** Declarar as Variavéis */

        String professor;
        String disciplina;
        String nomeAluno;
        int frequencia;
        int nota1;
        int nota2;
        float media;
        String situacao;

        /** Instanciar teclado Scanner*/

        Scanner teclado =  new Scanner(System.in);

        /** Coletar dados*/

        System.out.println("------------------------------------------------------------------");
        System.out.println("********************* Olá Profº seja bem vindo(a) ****************");
        System.out.print("Informe seu nome: ");
        professor = teclado.nextLine();
        System.out.print("Qual a discplina: ");
        disciplina = teclado.nextLine();
        System.out.print("Informe o nome do do(a) aluno(a): ");
        nomeAluno = teclado.nextLine();
        System.out.print("Informe a frequência: ");
        frequencia = teclado.nextInt();
        System.out.print("Informe a primeira nota: ");
        nota1 = teclado.nextInt();
        System.out.print("Informe a segunda nota: ");
        nota2 = teclado.nextInt();

        /** Calcula a média*/

        media = (nota1 + nota2)/2;

        boolean avaliaProf = professor.equals("vitor");

        /** Define condição do aluno*/

        if (media >= 7 && frequencia >= 75 && !avaliaProf || media >= 6 && frequencia >= 90 && !avaliaProf)  {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("___________________________________________________________________");
        System.out.println("            Formulário do(a) aluno(a) " + nomeAluno);
        System.out.println("Nome do Prof°: " + professor);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Nome aluno(a): " + nomeAluno);
        System.out.println("Frequência: " + frequencia);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("A situação do aluno é: " + situacao);
    }

}
