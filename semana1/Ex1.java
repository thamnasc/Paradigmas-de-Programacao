/*
Construa um programa em Java que leia um número e diga se ele é positivo
*/
import java.util.Scanner;

public class Ex1 
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Informe um número: \n");

        int num = keyboard.nextInt();

        if(num > 0)
            System.out.println("O número " + num + " é positivo");
        else if(num == 0)
            System.out.println("O número não é positivo nem negativo");
        else
            System.out.printf("O número %d é negativo \n", num);
        
        keyboard.close();
    }
}