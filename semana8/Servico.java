public class Servico implements Loja
{
    private String formato;
    private int minutos;

    public void vender()
    {
        System.out.println("Vendendo um serviço!");
    }

    public void acionarGarantia()
    {
        System.out.println("Acionando garantia de um serviço!");
    }
}