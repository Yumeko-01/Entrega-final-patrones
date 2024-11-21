/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal.patrones;

public class Estudiante {
    private String usuario;
    private String contrasena;
    private String id;
    private String nombre;
    private int creditosInscritos;

    public Estudiante(String usuario, String contrasena,String id ,String nombre) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.id = id;
        this.nombre = nombre;
        this.creditosInscritos = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditosActuales() {
        return creditosInscritos;
    }

    public void agregarCreditos(int creditos) {
        this.creditosInscritos += creditos;
    }
}

