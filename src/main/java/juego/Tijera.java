package juego;

public class Tijera extends ElementoDeJuego{

    @Override
    public boolean leGanaA(ElementoDeJuego elecionComputadora) {
        return elecionComputadora.pierdoContraTijera();
    }

    @Override
    public boolean pierdoContraPapel() {
        return false;
    }

    @Override
    public boolean pierdoContraPiedra() {
        return true;
    }

    @Override
    public boolean pierdoContraTijera() {
        return false;
    }
}
