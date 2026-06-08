package scrum;

public class Tarea implements ItemDeProyecto {
    public static final String VALIDA_TAREA_SIMPLE = "No puede crear una Epica o HS como tarea simple";
    private int horasEstimadas;
    private ItemDeProyecto tipoTarea;

    public Tarea(int horasEstimadas, ItemDeProyecto tipoTarea) {
        if(tipoTarea.puedoContenerA(new Spike())||tipoTarea.puedoContenerA(new TareaDesarrollo())){
            throw new RuntimeException(VALIDA_TAREA_SIMPLE);
        }
        this.horasEstimadas = horasEstimadas;
        this.tipoTarea = tipoTarea;
    }

    @Override
    public int horasTotales() {
        return this.horasEstimadas;
    }

    @Override
    public TipoTarea tipoTarea() {
        return tipoTarea.tipoTarea();
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
        return tipoTarea.contenidaPorHistoriaUsuario();
    }

    @Override
    public boolean contenidaPorEpica() {
        return tipoTarea.contenidaPorEpica();
    }
}
