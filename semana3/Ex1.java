import java.util.Scanner;

public class Ex1
{
    public static void main (String[] args)
    {
        Contador cont1 = new Contador();
        Contador cont2 = new Contador(9);

        System.out.println("Este é o conteúdo do cont1: " + cont1.getCont());
        System.out.println("Este é o conteúdo do cont2: " + cont2.getCont());

        cont2.zerar();
        System.out.println(cont2.toString());

        cont1.decrementar();
        System.out.println(cont1.toString());

        cont1.incrementar();
        System.out.println(cont1.toString());

    }
}