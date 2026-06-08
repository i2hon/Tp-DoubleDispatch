package laserX;

//este seria el junior
public class EmpleadoRegular implements Empleado {
    private final String nombre;
    private float salario;

    public EmpleadoRegular(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public float calcularSalario() {
        return salario;
    }

    @Override
    public Cargo cargo() {
        return Cargo.JUNIOR;
    }

    @Override
    public boolean puedeTenerComoEmpleadoA(Empleado empleado) {
        return false;
    }

    @Override
    public boolean puedeSerSubordinadoDelDirector() {
        return false;
    }

    @Override
    public boolean puedeSerSubordinadoDelMandoMedio() {
        return true;
    }

}
