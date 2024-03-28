package src;

import java.util.List;
public class Alumno {

    List<Materia> materiasAprobadas ;
    Integer legajo;


    public Alumno(Integer legajo, List<Materia> materiasAprobadas) {
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public List<Materia> obtenerMateriasAprobadas(){
        return materiasAprobadas;
    }

}
