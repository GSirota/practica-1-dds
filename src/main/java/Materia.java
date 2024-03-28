import java.util.List;

public class Materia {
    List<Materia> correlativas;
    String nombre;


    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = List.of();
    }

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;

    }

    protected boolean puedeCursar(Alumno alumno){
        List<Materia> materiasAprobadas = alumno.obtenerMateriasAprobadas();

        return correlativas.stream().allMatch(materia -> materiasAprobadas.contains(materia));
    }
}
