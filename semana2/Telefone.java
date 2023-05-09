public class Telefone
{
    private int ddi;
    private short ddd;
    private long numero;

    public Telefone(int ddi, short ddd, long numero)
    {
        setDdi(ddi);
        setDdd(ddd);
        setNumero(numero);
    }

    public void setDdi(int ddi)
    {
        boolean eua = ddi == 1;
        boolean bra = ddi == 55;
        boolean aus = ddi == 65;

        if (eua || bra || aus)
            this.ddi = ddi; 
    }

    public void setDdd(int ddd)
    {
        if (ddd >= 11 && ddd <= 99)
            this.ddd = ddd;
    }

    public void setNumero(long numero)
    {
        int digs = Long.toString(numero).length()

        if(digs >= 9)
            this.numero = numero;
    }
}