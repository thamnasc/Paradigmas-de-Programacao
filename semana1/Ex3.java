/* 
Faça um programa em Java que leia números inteiros enquanto não for digitado o
número -1, e calcule e imprima a soma destes números. 
*/
import java.util.Scanner;

public class Ex3
{
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int num = 0, soma = 0;

        do
        {
            soma += num;
            num = entrada.nextInt();
        } while(num != -1);

        System.out.println("A soma dos números é " + soma);

        entrada.close();
    }
}
