package laserx;

import laserX.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {
/*
    @Test
    public void calculoSalarial() {
        var director = new EmpleadoJerarquico("director", 1500, new Director());
        var mandoMedio = new EmpleadoJerarquico("mandoMedio", 500, new MandoMedio());
        var empleadoRegular = new EmpleadoRegular("empleadoRegular", 100);
        director.agregarEmpleado(mandoMedio);
        mandoMedio.agregarEmpleado(empleadoRegular);
        assertEquals(2100, new LaserX(director).masaSalarial());
   }


 */

//
//
//    @Test
//    public void directorNoPuedeSerJefeDeJunior() {
//        var director = new EmpleadoJerarquico("director1", 1000, new Director());
//        var empleadoRegular = new EmpleadoRegular("empleadoRegular", 100);
//
//        var e = assertThrows(RuntimeException.class, () -> {
//            director.agregarEmpleado(empleadoRegular);
//        });
//
//        assertEquals(EmpleadoJerarquico.ASIGNACION_EMPLEADO_INVALIDA, e.getMessage());
//    }
//
//    @Test
//    public void mandoMedioNoPuedeSerJefeDeDirector() {
//        var director = new EmpleadoJerarquico("director1", 1000, new Director());
//        var mandoMedio = new EmpleadoJerarquico("mandoMedio", 500, new MandoMedio());
//        var e = assertThrows(RuntimeException.class, () -> {
//            mandoMedio.agregarEmpleado(director);
//        });
//
//        assertEquals(EmpleadoJerarquico.ASIGNACION_EMPLEADO_INVALIDA, e.getMessage());
//    }
//
//    @Test
//    public void directorPuedeSerJefeDeMandoMedio() {
//        var director = new EmpleadoJerarquico("director1", 1000, new Director());
//        var mandoMedio = new EmpleadoJerarquico("mandoMedio", 500, new MandoMedio());
//        director.agregarEmpleado(mandoMedio);
//        assertTrue(director.tieneDeEmpeadoA(mandoMedio));
//    }
//
//    @Test
//    public void mandoMedioPuedeSerJefeDeJunior() {
//        var mandoMedio = new EmpleadoJerarquico("mandoMedio", 500, new MandoMedio());
//        var empleadoRegular = new EmpleadoRegular("empleadoRegular", 100);
//        mandoMedio.agregarEmpleado(empleadoRegular);
//        assertTrue(mandoMedio.tieneDeEmpeadoA(empleadoRegular));
//    }
}
