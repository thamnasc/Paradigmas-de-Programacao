/*
Construa um programa em Java que leia um número inteiro e diga se ele é par ou ímpar.
*/
import java.util.Scanner;

public class Ex2 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");

        if(input.nextInt() % 2 == 0)
            System.out.println("O número é par!");
        else
            System.out.println("O número é ímpar!");
        
        input.close();
    }
}