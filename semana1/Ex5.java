/*
5- Construa um programa em Java que leia um número x, calcule e escreva o valor da
função f(x), dada por:
a) 0 <= x < 5, f(x) = x
b) 5<= x <10; f(x) = 2x + 1
c) x >=10; f(x) = x - 3
*/

import java.util.Scanner;

public class Ex5
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int y;

        if (x >= 0 && x < 5)
            y = x;
        else if (x < 10)
            y = 2*x + 1;
        else
            y = x - 3;

        System.out.println("O resultado é: " + y); 
    }
}

