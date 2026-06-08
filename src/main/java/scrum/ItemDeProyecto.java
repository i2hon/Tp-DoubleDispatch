package scrum;

public interface ItemDeProyecto {
    int horasTotales();
    TipoTarea tipoTarea();

    boolean esTipoComplejo();

    boolean puedoContenerA(ItemDeProyecto tarea);
    boolean contenidaPorHistoriaUsuario();
    boolean contenidaPorEpica();
}
