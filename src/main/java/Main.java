import java.util.List;

public class Main {

    public static void main(List<Materia> materias, Alumno alumno) {
        Inscripcion inscripcion = new Inscripcion(materias,alumno);
        inscripcion.aprobada();
    }
}