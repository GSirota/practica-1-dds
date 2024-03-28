import java.util.List;

public class Inscripcion {

    List<Materia> materias ;
    Alumno alumno;

    public Inscripcion(List<Materia> materias, Alumno alumno) {
        this.materias = materias;
        this.alumno = alumno;
    }

    protected boolean aprobada(List<Materia> materiasIncripcion, Alumno alumno){
        return materias.stream().allMatch(materia -> materia.puedeCursar(this.alumno));
    }
}
