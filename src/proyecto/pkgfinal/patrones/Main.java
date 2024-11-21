/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkgfinal.patrones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaInscripcion sistema = SistemaInscripcion.getInstance();
        Autenticacion auth = new AutenticacionProxy(sistema);
        Scanner scanner = new Scanner(System.in);

        boolean autenticado = false;
        Estudiante estudianteAutenticado = null;

        while (!autenticado) {
            System.out.println("=== Sistema de Inscripción ===");
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();

            if (auth.autenticar(usuario, contrasena)) {
                System.out.println("Autenticación exitosa.");
                // Crear el estudiante autenticado
                estudianteAutenticado = sistema.obtenerEstudiantePorUsuario(usuario);
                autenticado = true;
            } else {
                System.out.println("Autenticación fallida. Intente nuevamente.");
            }
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Ver materias disponibles");
            System.out.println("2. Inscribir materia");
            System.out.println("3. Ver créditos inscritos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("\nMaterias disponibles:");
                    for (Materia materia : sistema.obtenerMaterias()) {
                        System.out.printf("- %s (%d créditos, %d cupos)\n",
                                materia.getNombre(), materia.getCreditos(), materia.getCupos());
                    }
                    break;

                case 2:
                    System.out.println("\nIngrese el ID de la materia a inscribir:");
                    String idMateria = scanner.nextLine();

                    Materia materiaSeleccionada = sistema.obtenerMaterias().stream()
                            .filter(m -> m.getId().equals(idMateria))
                            .findFirst()
                            .orElse(null);

                    if (materiaSeleccionada == null) {
                        System.out.println("Materia no encontrada.");
                    } else {
                        ProcesoInscripcion proceso = new ProcesoInscripcion() {
                            @Override
                            protected void procesarInscripcion(Estudiante estudiante, Materia materia) {
                                estudiante.agregarCreditos(materia.getCreditos());
                                materia.reducirCupo();
                            }
                        };

                        proceso.realizarInscripcion(estudianteAutenticado, materiaSeleccionada);
                    }
                    break;

                case 3:
                    System.out.printf("Créditos inscritos: %d\n", estudianteAutenticado.getCreditosActuales());
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }
}

