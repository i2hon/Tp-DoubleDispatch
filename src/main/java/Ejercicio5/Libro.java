package Ejercicio5;

public class Libro implements TipoArticulo{
    private int cantPaginas;

    public Libro(int cantPaginas){
        this.cantPaginas = cantPaginas;
    }

    //no uso double dispach ya que el estado no afecta a los dias prestados
    @Override
    public int solicutudDePrestameDe(Estado condicion) {
        return (int)Math.ceil(cantPaginas / 100.0);
    }

}
