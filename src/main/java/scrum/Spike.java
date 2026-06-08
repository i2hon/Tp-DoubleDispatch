package scrum;

public class Spike implements ItemDeProyecto{
    @Override
    public int horasTotales() {
        return 0;
    }

    @Override
    public TipoTarea tipoTarea() {
        return TipoTarea.SPIKE;
    }

    @Override
    public boolean esTipoComplejo() {
        return false;
    }

    @Override
    public boolean puedoContenerA(ItemDeProyecto tarea) {
        return false;
    }

    @Override
    public boolean contenidaPorHistoriaUsuario() {
        return false;
    }

    @Override
    public boolean contenidaPorEpica() {
        return true;
    }
}
