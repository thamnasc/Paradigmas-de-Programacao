
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

    public void setValorHora(float valor)
    {
        if(valor >= 6.5f)
            this.setValorHora(valor);
    }

    public void setHoras(int horas)
    {
        if(horas >= 40)
            this.setHoras(horas);
    }

    public float getValorHora()
    {
        return this.valorHora;
    }

    public int getHoras()
    {
        return this.horas;
    }
}