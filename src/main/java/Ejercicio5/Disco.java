package Ejercicio5;

public class Disco implements TipoArticulo{
    private int anoDeLansamiento;

    public Disco(int anoDeLansamiento){
        this.anoDeLansamiento = anoDeLansamiento;
    }

    @Override
    public int solicutudDePrestameDe(Estado condicion) {
        return condicion.estadoDeDisco(this);
    }

    public int prestarDiscoDeteriorado(){
        if (anoDeLansamiento < 1980){
            throw new RuntimeException("no se puede prestar el disco");
        }
        //como solo se presta cuando la fecha es igual o superior a 1980 se el prestamo seria de 5 dias
        //pero como esta deteriorado se le resta 1 entonces el prestamo es de 4 dias
        return prestarDisco()-1;
    }


    public int prestarDisco(){
        if(anoDeLansamiento < 1980){
            return 3;
        }
        return 5;
    }

}
