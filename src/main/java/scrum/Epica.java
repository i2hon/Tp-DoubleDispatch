package scrum;

public class Epica implements ItemDeProyecto{
    @Override
    public int horasTotales() {
        return 0;
    }

    @Override
    public TipoTarea tipoTarea() {
        return TipoTarea.EPICA;
    }

    @Override
    public boolean esTipoComplejo() {
        return true;
    }

    @Override
    public boolean puedoContenerA(ItemDeProyecto tarea) {
        return tarea.contenidaPorEpica();
    }

    @Override
    public boolean contenidaPorHistoriaUsuario() {
        return false;
    }

    @Override
    public boolean contenidaPorEpica() {
        return false;
    }
}
