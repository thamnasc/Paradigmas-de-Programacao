/*
1) Crie um programa Java que leia uma sentença e substitua
todas as letras a por @
2) Crie um programa Java que leia uma sentença e remova
todos os espaços em branco
3) Fazer um programa em Java que leia um nome no formato
comum, por exemplo “José Silva”, e o imprima no formato
“Silva, J.”.
*/

import java.util.Scanner;
import java.util.Arrays;

public class Slides
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String sentenca;
 
        // 1
        sentenca = input.nextLine().replace("a", "@");
        System.out.println(sentenca);
        
        // 2
        sentenca = input.nextLine().replaceAll(" ", "");
        System.out.println(sentenca);

        // 3
        sentenca = input.nextLine();

        //cria quantos elementos num array forem necessario ao dividir a string pelos espaços
        String[] nomes = sentenca.split(" ", 0);

        //pega o último elemento do array
        System.out.print(nomes[(nomes.length-1)]+", ");
        
        //retira o último elemento
        nomes = Arrays.copyOf(nomes, nomes.length-1);

        //imprime a primeira letra de cada elemento
        for(String nome : nomes)
            System.out.print(nome.charAt(0)+". "); 
        System.out.println();

        // 3
/*         sentenca = input.nextLine();
        String[] nomes = sentenca.split(" ", 0);
        System.out.print(nomes[(nomes.length-1)]+", ");
        for(int i = 0; i < nomes.length-1; i++)
            System.out.print(nomes[i].charAt(0)+". ");
        System.out.println(); */
    }
}