/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal.patrones;

public class NotificacionEvento implements Observador {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Evento notificado: " + mensaje);
    }
}
