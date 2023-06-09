
public class FuncHorista extends Funcionario
{
    private float valorHora;
    private int horas;

    public FuncHorista() {}

    public FuncHorista(String nome, int matricula, Data dataContr, boolean estrangeiro, float valor, int horas)
    {
        super(nome, matricula, dataContr, estrangeiro);
        this.setValorHora(valor);
        this.setHoras(horas);
    }

    public FuncHorista(String nome, int matricula, float valor, int horas)
    {
        this(nome, matricula, null, false, valor, horas);
    }

    public FuncHorista(String nome, int matricula)
    {
        this(nome, matricula, null, false, 0.0f, 0);
    }

    public void setValorHora(float valor)
    {
        if(valor >= 6.5)
            this.valorHora = valor;
    }

    public void setHoras(int horas)
    {
        if(horas >= 40)
            this.horas = horas;
    }

    public float getValorHora()
    {
        return this.valorHora;
    }

    public int getHoras()
    {
        return this.horas;
    }

    @Override
    public float calcularSalarioFinal()
    {
        return horas * valorHora;
    }
}