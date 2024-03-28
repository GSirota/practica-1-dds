package src;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Materia am = new Materia("Matematica",  null);
        Materia algoritmos = new Materia("Algoritmos y Estructura de Datos", null);
        Materia pdep = new Materia("Paradigmas de Programacion", null);

        List<Materia> materias = List.of(am, algoritmos, pdep);

        Inscripcion inscripcion = new Inscripcion(materias);


        inscripcion.aprobada();

    }
}