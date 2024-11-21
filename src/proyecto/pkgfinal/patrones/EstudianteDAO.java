/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto.pkgfinal.patrones;

import java.util.List;

public interface EstudianteDAO {
    void agregarEstudiante(Estudiante estudiante);
    Estudiante obtenerEstudiantePorId(String id);
    List<Estudiante> obtenerTodosEstudiantes();
}
