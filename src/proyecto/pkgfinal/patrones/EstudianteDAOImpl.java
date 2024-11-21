/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal.patrones;

import java.util.ArrayList;
import java.util.List;

public class EstudianteDAOImpl implements EstudianteDAO {
    private List<Estudiante> estudiantes = new ArrayList<>();

    @Override
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public Estudiante obtenerEstudiantePorId(String id) {
        return estudiantes.stream()
                .filter(estudiante -> estudiante.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Estudiante> obtenerTodosEstudiantes() {
        return estudiantes;
    }
}
