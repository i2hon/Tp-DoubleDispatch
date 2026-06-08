package juego;

public abstract class ElementoDeJuego {
    public abstract boolean leGanaA(ElementoDeJuego elecionComputadora);
    public abstract boolean pierdoContraPapel();
    public abstract boolean pierdoContraPiedra();
    public abstract boolean pierdoContraTijera();

    public boolean empataCon(ElementoDeJuego elementoDeJuego){
        return this.getClass().equals(elementoDeJuego.getClass());
    }

}
