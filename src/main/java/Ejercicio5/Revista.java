package Ejercicio5;

import java.time.LocalDateTime;

public class Revista implements TipoArticulo{
    private LocalDateTime fechaDePublicacion;
    private int paginas;

    public Revista(LocalDateTime fechaDePublicacion, int paginas){
        this.fechaDePublicacion = fechaDePublicacion;
        this.paginas = paginas;
    }
    @Override
    public int solicutudDePrestameDe(Estado condicion) {
        return condicion.estadoDeRevista(this);
    }


    public int prestarRevistaDeteriorada() {
        int dias = prestarRevista();
        if(fechaDePublicacion.isBefore(LocalDateTime.now().minusYears(10))){
            return dias - 3;

        }
        return dias - 1;
    }

    public int prestarRevista(){
        if (paginas < 100) {
            return 2;
        } else if (paginas < 2000) {
            return  3;
        }
        return  5;
    }
}
