public class Main
{
    public static void main(String[] args)
    {
        CartaoWeb[] cartoes = new CartaoWeb[5];
        cartoes[0] = new CartaoAniversario("Harry");
        cartoes[1] = new CartaoNatal("Santa Klaus");
        cartoes[2] = new CartaoDiaDosNamorados("Tiago");
        cartoes[3] = new CartaoNatal("Elf");
        cartoes[4] = new CartaoAniversario("Taylor");

        for (CartaoWeb cartao : cartoes)
            cartao.retornarMensagem("Thali");
    }
}