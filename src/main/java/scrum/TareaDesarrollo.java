package scrum;

public class TareaDesarrollo implements ItemDeProyecto{
    @Override
    public int horasTotales() {
        return 0;
    }

    @Override
    public TipoTarea tipoTarea() {
        return TipoTarea.TAREA_DESARROLLO;
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
        return true;
    }

    @Override
    public boolean contenidaPorEpica() {
        return false;
    }
}
