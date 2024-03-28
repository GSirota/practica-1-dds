package src;

import java.util.List;

public class Inscripcion {

    List<Materia> materias ;
    Alumno alumno;

    public Inscripcion(List<Materia> materias) {
        this.materias = materias;
    }

    protected boolean aprobada(){
        for(Materia materia: materias){
            materia.puedeCursar(alumno);
        }
        return false;
    }
}
