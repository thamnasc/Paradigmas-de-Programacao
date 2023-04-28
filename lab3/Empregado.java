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
    //public int compareTo (Empregado e)
    //{
    //    if(this.salario < e.salario) // inverte - ordem decrescente
    //        return -1;
    //    else if(this.salario > e.salario) // inverte - ordem decrescente
    //        return 1;
    //    else // se for igual
    //        return 0;
    //}

    //se for para ordenar pelo nome:
    public int compareTo (Empregado e)
    {//compareTo
        if(this.nome.charAt(0) < e.nome.charAt(0)) // inverte - ordem decrescente
            return -1;
        else if(this.nome.charAt(0) > e.nome.charAt(0)) // inverte - ordem decrescente
            return 1;
        else // se for igual
            return 0;
    }
}