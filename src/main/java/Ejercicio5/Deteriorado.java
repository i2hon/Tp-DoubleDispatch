package Ejercicio5;

public class Deteriorado implements Estado{
    @Override
    public int estadoDeDisco(Disco articulo) {
        return articulo.prestarDiscoDeteriorado();
    }

    @Override
    public int estadoDeRevista(Revista articulo) {
        return articulo.prestarRevistaDeteriorada();
    }
}
