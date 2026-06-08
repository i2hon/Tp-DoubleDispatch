package scrum;

public class HistoriaUsuario implements ItemDeProyecto{
    @Override
    public int horasTotales() {
        return 0;
    }

    @Override
    public TipoTarea tipoTarea() {
        return TipoTarea.HISTORIA_USUARIO;
    }

    @Override
    public boolean esTipoComplejo() {
        return true;
    }

    @Override
    public boolean puedoContenerA(ItemDeProyecto tarea) {
        return tarea.contenidaPorHistoriaUsuario();
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
