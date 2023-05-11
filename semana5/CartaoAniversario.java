public class CartaoAniversario extends CartaoWeb
{

    public CartaoAniversario(String destinatario)
    {
        super(destinatario);
    }

    public void retornarMensagem(String remetente)
    {
        System.out.print("Queridx " + this.getDestinatario() + ",\n" +
        "Feliz Aniversário!\n" + "Abraços,\n" + remetente + ".\n");
    }
}