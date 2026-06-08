package laserX;

public class Director implements Empleado{
    @Override
    public Cargo cargo() {
        return Cargo.DIRECTOR;
    }

    @Override
    public float calcularSalario() {
        return 0;
    }

    @Override
    public boolean puedeTenerComoEmpleadoA(Empleado empleado) {
        return empleado.puedeSerSubordinadoDelDirector();
    }

    @Override
    public boolean puedeSerSubordinadoDelDirector() {
        return false;
    }

    @Override
    public boolean puedeSerSubordinadoDelMandoMedio() {
        return false;
    }


}
