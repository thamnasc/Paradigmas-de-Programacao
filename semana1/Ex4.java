/*
4- Faça um programa em Java que calcule e imprima a soma dos 10 primeiros múltiplos de 3.
*/

public class Ex4
{
    public static void main(String[] args)
    {
        int mult = 3, i = 0, soma = 0;

        while (i < 10)
        {
            soma += mult;
            mult += 3;
            i++;
        }

        System.out.println("A soma dos 10 primeiros números múltiplos de 3 é: " + soma);
    }
}