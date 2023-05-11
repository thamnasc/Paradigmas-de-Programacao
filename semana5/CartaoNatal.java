public class CartaoNatal extends CartaoWeb
{

    public CartaoNatal(String destinatario)
    {
        super(destinatario);
    }

    public void retornarMensagem(String remetente)
    {
        System.out.print("Queridx " + this.getDestinatario() + ",\n" +
        "Feliz Natal!\n" + "Abraços,\n" + remetente + ".\n");
    }
}