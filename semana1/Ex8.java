/*
8- Faça um programa em Java que leia os valores do peso e da altura de pessoas, enquanto
não for digitado o número -1, conte e escreva quantas pessoas estão acima do peso. A
condição (peso /(altura*altura)) <= 25 diz que a pessoa está no peso normal.
*/

import java.util.Scanner;

public class Ex8
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int pessoas = 0;
        float peso, altura, imc;

        peso = entrada.nextFloat();
        altura = entrada.nextFloat();

        boolean condicao = true;

        while (condicao)
        {
            imc = peso / altura * altura;
            if (imc > 25)
                pessoas++;

            peso = entrada.nextFloat();
            altura = entrada.nextFloat();

            condicao = (peso != -1.0f) && (altura != -1.0f);
        }

        System.out.println(pessoas + " pessoas estão acima do peso.");
    }
}