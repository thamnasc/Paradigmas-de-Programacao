public class FuncMensalista extends Funcionario 
{
    private float salario;
    
    public FuncMensalista(String nome, int matricula, Data dataContr, boolean estrangeiro, float salario)
    {
        super(nome, matricula, dataContr, estrangeiro);
        this.setSalario(salario);
    }
    
    public FuncMensalista(String nome, int matricula, float salario)
    {
        this(nome, matricula, null, false, salario);
    }

    public FuncMensalista(String nome, int matricula)
    {
        this(nome, matricula, null, false, 0.0f);
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

    @Override
    public float calcularSalarioFinal()
    {
        return salario;
    }
}