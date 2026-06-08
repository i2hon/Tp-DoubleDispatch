package Ejercicio5;

public class Usado implements Estado{
    @Override
    public int estadoDeDisco(Disco articulo) {
        return articulo.prestarDisco();
    }

    @Override
    public int estadoDeRevista(Revista articulo) {
        return articulo.prestarRevista();
    }
}
