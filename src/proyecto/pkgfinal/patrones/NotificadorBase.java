/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal.patrones;

public class NotificadorBase extends Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Notificación base: " + mensaje);
    }
}
