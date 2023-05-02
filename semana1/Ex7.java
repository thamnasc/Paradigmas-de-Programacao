/*
7- Faça um programa em Java que leia as 4 notas de 30 alunos da turma e escreva a maior
nota de cada aluno e a maior nota da turma.
*/

import java.util.Scanner;

public class Ex7
{
    public static final int ALUNOS = 30;
    public static void main(String[] args)
    {
        float[] maiorNotaAluno = new float[ALUNOS];
        float maiorNotaTurma = 0f;
        Scanner entrada = new Scanner(System.in);
        float maiorNota, nota;

        for (int i = 0; i < ALUNOS; i++)
        {
            maiorNota = entrada.nextFloat();
            for (int j = 0; j < 3; j++)
            {
                nota = entrada.nextFloat();
                if (maiorNota < nota)
                    maiorNota = nota;
            }
            maiorNotaAluno[i] = maiorNota;

            if(maiorNota > maiorNotaTurma)
                maiorNotaTurma = maiorNota;
        }

        System.out.printf("A maior nota da turma é %.2f.\n", maiorNotaTurma);
        for (int i = 0; i < ALUNOS; i++)
            System.out.printf("A maior nota do aluno %d é %.2f\n", (i+1), maiorNotaAluno[i]);
    }
}