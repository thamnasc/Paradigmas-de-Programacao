public class FuncMensalista extends Funcionario 
{
    private float salario;
    
    public FuncMensalista(String nome, int matricula, Data dataContr, boolean estrangeiro, float salario)
    {
        super(nome, matricula, dataContr, estrangeiro);
        this.setSalario(salario);
    }

    public void setSalario(float salario)
    {
        if(salario > 1500.0)
            this.salario = salario;
    }

    public float getSalario()
    {
        return this.salario;
    }
}