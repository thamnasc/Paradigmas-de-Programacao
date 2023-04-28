import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Empregado e1 = new Empregado("Fulano", 1500f);
        Empregado e2 = new Empregado("Ciclano", 1900f);
        Empregado e3 = new Empregado("Beltrano", 2100f);
        Empregado e4 = new Empregado("Beltrano", 2100f);

        Collection<Empregado> tree = new TreeSet<Empregado>(); //polimorfismo upcast coerção-inclusão
        tree.add(e1);
        tree.add(e2);
        tree.add(e3);

        Iterator<Empregado> i = tree.iterator();

        //não precisa chamar o método de comparação
        while(i.hasNext())
        {
            Empregado e = i.next();
            System.out.println(e.getNome() + " " + e.getSalario());
        }
    }
}