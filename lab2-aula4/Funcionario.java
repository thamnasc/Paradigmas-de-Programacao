
public class Funcionario
{
    protected String nome;
    protected int matricula;
    protected Data dataContr;
    protected boolean estrangeiro;
    
    public Funcionario() {}

    public Funcionario(String nome, int matricula, Data data, boolean estrangeiro) 
    {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setDataContr(data);
        this.setEstrangeiro(estrangeiro);
    }

    public void setNome(String nome) 
    {
        if(nome.length() >= 3)
            this.nome = nome;
    }

    public void setMatricula(int matricula)
    {
        if(matricula > 0)
            this.matricula = matricula; 
    }

    public void setDataContr(Data data)
    {
        this.dataContr = data;
    }

    public void setEstrangeiro(boolean estrangeiro)
    {
        this.estrangeiro = estrangeiro;
    } 

    public String getNome()
    {
        return this.nome;
    }

    public int getMatricula()
    {
        return this.matricula;
    }

    public Data getDataContr()
    {
        return this.dataContr;
    }

    public boolean isEstrangeiro()
    {
        return this.estrangeiro;
    }

    public String toString()
    {
        return "Nome: " + this.nome + "\n" +
            "Matricula: " + this.matricula + "\n" +
            "Data de contratação: " + this.getDataContr() + "\n" +
            (this.estrangeiro ? "É estrangeiro" : "Não é estrangeiro"); 
    }

    public float calcularSalarioFinal()
    {
        return 0.0f;
    }
}