package juego;

public class Piedra extends ElementoDeJuego{
    @Override
    public boolean leGanaA(ElementoDeJuego elecionComputadora) {
        return elecionComputadora.pierdoContraPiedra();
    }

    @Override
    public boolean pierdoContraPapel() {
        return true;
    }

    @Override
    public boolean pierdoContraPiedra() {
        return false;
    }

    @Override
    public boolean pierdoContraTijera() {
        return false;
    }
}
