package src;

import java.util.List;

public class Materia {
    List<Materia> correlativas;
    String nombre;


    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    protected boolean puedeCursar(Alumno alumno){
        List<Materia> materiasAprobadas = alumno.obtenerMateriasAprobadas();

        for (Materia materia:correlativas){
            if (!materiasAprobadas.contains(materia))
                return false;
        }

        return true;
    }
}
