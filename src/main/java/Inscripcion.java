import java.util.List;

public class Inscripcion {

    List<Materia> materias ;
    Alumno alumno;

    public Inscripcion(List<Materia> materias, Alumno alumno) {
        this.materias = materias;
        this.alumno = alumno;
    }

    protected boolean aprobada(){
        return materias.stream().allMatch(materia -> materia.puedeCursar(alumno));
    }
}
