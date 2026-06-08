package laserX;

public interface Empleado {

    float calcularSalario();

    Cargo cargo();

    boolean puedeTenerComoEmpleadoA(Empleado empleado);

    boolean puedeSerSubordinadoDelDirector();

    boolean puedeSerSubordinadoDelMandoMedio();
}