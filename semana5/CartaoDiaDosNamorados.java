public class CartaoDiaDosNamorados extends CartaoWeb
{

    public CartaoDiaDosNamorados(String destinatario)
    {
        super(destinatario);
    }

    public void retornarMensagem(String remetente)
    {
        System.out.print("My " + this.getDestinatario() + ",\n" +
        "Happy Valentine's Day!\n" + "xoxo,\n" + remetente + ".\n");
    }
}