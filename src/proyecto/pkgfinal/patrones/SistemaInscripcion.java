/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal.patrones;

import java.util.ArrayList;
import java.util.List;

public class SistemaInscripcion {
    private static SistemaInscripcion instance;
    private List<Estudiante> estudiantes;
    private List<Materia> materias;

    private SistemaInscripcion() {
        estudiantes = new ArrayList<>();
        materias = new ArrayList<>();
        
        // Pre-registrar estudiantes para la validación
        estudiantes.add(new Estudiante("juan", "1234","5666", "Juan Pérez"));
        estudiantes.add(new Estudiante("ana", "abcd","0987", "Ana Gómez"));
        
        // Pre-registrar algunas materias para la inscripción
        materias.add(new Materia("MAT101", "Matemáticas", 10, 5));
        materias.add(new Materia("FIS101", "Física", 10, 3));
        materias.add(new Materia("QUI101", "Química", 10, 4));
    }

    public static SistemaInscripcion getInstance() {
        if (instance == null) {
            instance = new SistemaInscripcion();
        }
        return instance;
    }

    // Métodos para registrar estudiantes y materias
    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Estudiante> obtenerEstudiantes() {
        return estudiantes;
    }

    public List<Materia> obtenerMaterias() {
        return materias;
    }

    public Estudiante obtenerEstudiantePorUsuario(String usuario) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getUsuario().equals(usuario)) {
                return estudiante;
            }
        }
        return null;
    }
}
