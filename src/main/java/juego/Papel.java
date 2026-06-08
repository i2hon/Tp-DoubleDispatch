package juego;

public class Papel extends ElementoDeJuego{
    @Override
    public boolean leGanaA(ElementoDeJuego elecionComputadora) {
        return elecionComputadora.pierdoContraPapel();
    }

    @Override
    public boolean pierdoContraPapel() {
        return false;
    }

    @Override
    public boolean pierdoContraPiedra() {
        return false;
    }

    @Override
    public boolean pierdoContraTijera() {
        return true;
    }
}
