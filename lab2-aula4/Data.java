public class Data
{
    private byte dia;
    private byte mes;
    private short ano;

    public Data() {}

    public Data(byte dia, byte mes, short ano) 
    {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public void setDia(byte dia)
    {
        if(dia > 0 && dia <= 31)
            this.dia = dia;
    }

    public void setMes(byte mes)
    {
        if(mes > 0 && mes <= 12)
            this.mes = mes;
    }

    public void setAno(short ano)
    {
        if(ano > 0)
            this.ano = ano;
    }

    public byte getDia()
    {
        return this.dia;
    }

    public byte getMes()
    {
        return this.mes;
    }

    public short getAno()
    {
        return this.ano;
    }
}