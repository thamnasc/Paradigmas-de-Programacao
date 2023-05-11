public abstract class CartaoWeb
{
    protected String destinatario;

    public CartaoWeb(){}

    public CartaoWeb(String destinatario)
    {
        this.setDestinatario(destinatario);
    }

    public void setDestinatario(String destinatario)
    {
        if (destinatario.length() > 2)
            this.destinatario = destinatario;
    }

    public String getDestinatario()
    {
        return this.destinatario;
    }

    public abstract void retornarMensagem(String remetente);
}