package laserX;

public class MandoMedio implements Empleado {

    @Override
    public float calcularSalario() {
        return 0;
    }

    @Override
    public Cargo cargo() {
        return Cargo.MANDOMEDIO;
    }

    @Override
    public boolean puedeTenerComoEmpleadoA(Empleado empleado) {
        return empleado.puedeSerSubordinadoDelMandoMedio();
    }

    @Override
    public boolean puedeSerSubordinadoDelDirector() {
        return true;
    }

    @Override
    public boolean puedeSerSubordinadoDelMandoMedio() {
        return false;
    }

}
