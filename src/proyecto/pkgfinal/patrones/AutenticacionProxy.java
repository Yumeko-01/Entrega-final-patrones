/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal.patrones;

public class AutenticacionProxy implements Autenticacion {
    private SistemaInscripcion sistema;

    public AutenticacionProxy(SistemaInscripcion sistema) {
        this.sistema = sistema;
    }

    @Override
    public boolean autenticar(String usuario, String contrasena) {
        Estudiante estudiante = sistema.obtenerEstudiantePorUsuario(usuario);
        if (estudiante != null && estudiante.getContrasena().equals(contrasena)) {
            return true;
        }
        return false;
    }
}

