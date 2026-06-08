package laserX;

import java.util.ArrayList;
import java.util.List;


public class EmpleadoJerarquico implements Empleado {
    public static final String VALIDA_EMPLADO_JERARQUICO = "Solo directores o mandos medios son empleados jerarquicos";
    private final String nombre;
    private List<Empleado> empleados;
    private float salario;
    private Empleado cargo;

    public EmpleadoJerarquico(String nombre, float salario, Empleado cargo) {
        if(!cargo.cargo().equals(Cargo.DIRECTOR)&&!cargo.cargo().equals(Cargo.MANDOMEDIO)){
            throw new RuntimeException(VALIDA_EMPLADO_JERARQUICO);
        }
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        if (!puedeTenerComoEmpleadoA(empleado)) {
            throw new RuntimeException("cargo invalido");
        }
        this.empleados.add(empleado);
    }

    @Override
    public float calcularSalario() {
        float total = this.salario;
        for (Empleado m : empleados) {
            total += m.calcularSalario();
        }
        return total;
    }

    @Override
    public Cargo cargo() {
        return cargo.cargo();
    }

    @Override
    public boolean puedeTenerComoEmpleadoA(Empleado empleado) {
        return cargo.puedeTenerComoEmpleadoA(empleado);
    }

    @Override
    public boolean puedeSerSubordinadoDelDirector() {
        return cargo.puedeSerSubordinadoDelDirector();
    }

    @Override
    public boolean puedeSerSubordinadoDelMandoMedio() {
        return cargo.puedeSerSubordinadoDelMandoMedio();
    }
}
