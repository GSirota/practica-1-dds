import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class InscripcionMateriasTest {
    Materia algoritmos = new Materia("Algoritmos y Estructura de Datos");
    Materia pdep = new Materia("Paradigmas de Programacion", List.of(algoritmos));
    Materia am = new Materia("Matematica");

    @Test
    public void materiasConCorrelativasAprobadas(){

        List<Materia>  materiasIncripcion = List.of(pdep);
        List<Materia>  materiasAprobadas =  List.of(algoritmos);

        Alumno alumno = new Alumno(1234,materiasAprobadas);
        Inscripcion inscripcion = new Inscripcion(materiasIncripcion, alumno);

        Assert.assertTrue(inscripcion.aprobada(materiasIncripcion, alumno));

    }
    
    @Test
    public void materiasConCorrelativasNoAprobadas(){

        List<Materia>  materiasIncripcion = List.of(pdep);
        List<Materia>  materiasAprobadas = List.of(am);

        Alumno alumno = new Alumno(1234, materiasAprobadas);
        Inscripcion inscripcion = new Inscripcion(materiasIncripcion, alumno);

        Assert.assertFalse(inscripcion.aprobada(materiasIncripcion, alumno));

    }


}
