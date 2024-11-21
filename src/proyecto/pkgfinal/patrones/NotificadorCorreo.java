/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal.patrones;

public class NotificadorCorreo extends Notificador {
    private Notificador decorado;

    public NotificadorCorreo(Notificador decorado) {
        this.decorado = decorado;
    }

    @Override
    public void enviar(String mensaje) {
        decorado.enviar(mensaje);
        System.out.println("Enviando correo: " + mensaje);
    }
}
