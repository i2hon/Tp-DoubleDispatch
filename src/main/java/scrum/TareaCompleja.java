package scrum;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ItemDeProyecto {
    public static final String VALIDA_HISTORIA = "Solo tareas de desarrollo se permiten en una historia de usuario";
    public static final String VALIDA_EPICA = "Solo spikes se permiten en una epica";
    public static final String VALIDA_TAREA_COMPLEJA = "No puede crear TS o Spike como Tarea Compleja";
    static final String VALIDAR_AGREGAR_ITEM = "No se puede agregar este tipo de item a la tareas de tipo: ";
    private List<ItemDeProyecto> items = new ArrayList<>();
    private int horasEstimadas;
    private ItemDeProyecto tipoTarea;

    public TareaCompleja(int horasEstimadas, ItemDeProyecto tipoTarea) {
        if(!tipoTarea.esTipoComplejo()) {
            throw new RuntimeException(VALIDA_TAREA_COMPLEJA);
        }
        this.horasEstimadas = horasEstimadas;
        this.tipoTarea = tipoTarea;
    }

    public void agregarItem(ItemDeProyecto item) {
        //Una historia de usuario solo puede tener tareas de desarrollo
        //Una Epica solo puede tener Apikes
        if(!this.tipoTarea.puedoContenerA(item)){
            throw new RuntimeException(VALIDAR_AGREGAR_ITEM + this.tipoTarea.tipoTarea());
        }

        this.items.add(item);
    }


    public int horasTotales() {
        int horasTotales = this.horasEstimadas;
        for (ItemDeProyecto item : items) {
            horasTotales += item.horasTotales();
        }
        return horasTotales;
    }

    @Override
    public TipoTarea tipoTarea() {
        return this.tipoTarea.tipoTarea();
    }

    @Override
    public boolean esTipoComplejo() {
        return true;
    }

    @Override
    public boolean puedoContenerA(ItemDeProyecto tarea) {
        return tipoTarea.puedoContenerA(tarea);
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
