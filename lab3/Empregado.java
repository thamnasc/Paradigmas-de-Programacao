public class Empregado implements Comparable<Empregado>
{
    private String nome;
    private float salario;

    public Empregado(String nome, float salario)
    {
        this.setNome(nome);
        this.setSalario(salario);
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setSalario(float salario)
    {
        this.salario = salario;
    }

    public String getNome()
    {
        return this.nome;
    }

    public float getSalario()
    {
        return this.salario;
    }

    //método abstrato da interface precisa ser implementado pela classe não abstrata!
    //para ordenar pelo salario
    //public int compareTo (Empregado e)
    //{
    //    if(this.salario < e.salario) // inverte > para ordenar decrescentemente
    //        return -1;
    //    else if(this.salario > e.salario) // inverte < para ordenar decrescentemente
    //        return 1;
    //    else // se for igual
    //        return 0;
    //}

    //se for para ordenar pelo nome
    public int compareTo (Empregado e)
    {
        return this.nome.compareTo(e.getNome());
        // retorna 0 se for igual
        // retorna 1 se this.nome for depois no alfabeto
        // retorna -1 se e.getNome() for depois no alfabeto

        // em termos práticos: ordena em ordem alfabética!
    }
}