/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal.patrones;

public class Materia {
    private String id;
    private String nombre;
    private int cupos;
    private int creditos;

    public Materia(String id, String nombre, int cupos, int creditos) {
        this.id = id;
        this.nombre = nombre;
        this.cupos = cupos;
        this.creditos = creditos;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCupos() {
        return cupos;
    }

    public int getCreditos() {
        return creditos;
    }

    public boolean reducirCupo() {
        if (cupos > 0) {
            cupos--;
            return true;
        }
        return false;
    }
}

