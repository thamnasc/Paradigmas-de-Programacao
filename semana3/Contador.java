/*
Liste o nome de cinco classes que poderiam ter como atributo um contador do
tipo desta classe.
    1. Instituição banco (quando uma conta é criada ou excluída)
    2. Estoque de produtos
    3. Playlist de música (adicionar ou excluir uma música da playlist e guardar o número)
    4. Álbum de fotos
    5. Guarda-roupa
*/

public class Contador {

    private int cont;

    public Contador(){}

    public Contador(int cont)
    {
        setCont(cont);
    }

    public int getCont()
    {
        return this.cont;
    }

    public void setCont(int cont)
    {
        if(cont >= 0)
            this.cont = cont;
    }

    public void zerar()
    {
        setCont(0);
    }

    public void incrementar()
    {
        setCont(this.cont+1);
    }

    public void decrementar()
    {
        setCont(this.cont-1);
    }

    public String toString()
    {
        return String.format("Cont: %d", cont);
    }
}