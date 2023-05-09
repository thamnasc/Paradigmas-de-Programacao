public class Time 
{
    private int hora;
    private int minutos;

    public Time(){}

    public Time(int h, int m)
    {
        setHora(h);
        setMinutos(m);
    }

    public Time(int h)
    {
        this(h, 0);
    }

    public int getHora()
    {
        return this.hora;
    }

    public void setHora(int h)
    {
        if (h >= 0 && h < 24)
            this.hora = h;
    }

    public int getMinutos()
    {
        return this.minutos;
    }

    public void setMinutos(int m)
    {
        if (m >= 0 && m < 60)
            this.minutos = m;
    }

    


}
