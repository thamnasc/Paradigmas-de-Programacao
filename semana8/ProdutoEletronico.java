public class ProdutoEletronico implements Loja
{
    private String nomeFabri;
    private float peso;
    private String marca;

    public void vender()
    {
        System.out.println("Vendendo um eletrônico!");
    }

    public void acionarGarantia()
    {
        System.out.println("Acionando garantia do eletrônico!");
    }
}