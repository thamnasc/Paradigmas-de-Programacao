
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
}