/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto.pkgfinal.patrones;

public abstract class ProcesoInscripcion {
    public final void realizarInscripcion(Estudiante estudiante, Materia materia) {
        if (validarCupos(materia) && validarCreditos(estudiante, materia)) {
            procesarInscripcion(estudiante, materia);
            postProcesarInscripcion(estudiante, materia);
        }
    }

    protected boolean validarCupos(Materia materia) {
        return materia.getCupos() > 0;
    }

    protected boolean validarCreditos(Estudiante estudiante, Materia materia) {
        return estudiante.getCreditosActuales() + materia.getCreditos() <= 20; // Ejemplo de límite
    }

    protected abstract void procesarInscripcion(Estudiante estudiante, Materia materia);

    protected void postProcesarInscripcion(Estudiante estudiante, Materia materia) {
        System.out.println("Inscripción completa para: " + materia.getNombre());
    }
}

