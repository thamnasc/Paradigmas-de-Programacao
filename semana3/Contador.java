/*
Liste o nome de cinco classes que poderiam ter como atributo um contador do
tipo desta classe.
    1. Instituição banco (quando uma conta é criada ou excluída)
    2. Estoque de produtos
    3. Playlist de música (adicionar ou excluir uma música da playlist e guardar o número)
    4. Álbum de fotos
    5. Guarda-roupa
    6. Hábito (para contabilizar dias seguidos)
*/

public class Contador {

    private int cont;

    public Contador(){}

    public Contador(int cont)
    {
        this.setCont(cont);
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
        this.setCont(0);
    }

    public void incrementar()
    {
        this.setCont(this.cont+1);
    }

    public void decrementar()
    {
        this.setCont(this.cont-1);
    }

    public String toString()
    {
        return String.format("Cont: %d", cont);
    }
}