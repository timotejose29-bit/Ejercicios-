import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RegistroNotas registro = new RegistroNotas();

        try {

            System.out.print("¿Cuántos estudiantes desea registrar? ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            // Registrar estudiantes
            for (int i = 0; i < cantidad; i++) {

                System.out.print("\nIngrese el nombre del estudiante: ");
                String nombre = scanner.nextLine();

                registro.agregarEstudiante(nombre);

                System.out.print("¿Cuántas notas desea agregar? ");
                int cantidadNotas = scanner.nextInt();

                for (int j = 0; j < cantidadNotas; j++) {

                    System.out.print("Ingrese la nota " + (j + 1) + ": ");
                    double nota = scanner.nextDouble();

                    registro.agregarNota(nombre, nota);
                }

                scanner.nextLine();
            }

            // Consultar estudiante
            System.out.print("\nIngrese el nombre del estudiante a consultar: ");
            String buscar = scanner.nextLine();

            if (!registro.existeEstudiante(buscar)) {

                System.out.println("El estudiante no existe.");

            } else if (!registro.tieneNotas(buscar)) {

                System.out.println("El estudiante no tiene notas registradas.");

            } else {

                double promedio = registro.calcularPromedio(buscar);

                System.out.println("Promedio de " + buscar + ": " + promedio);
            }

            // Mostrar estudiantes aprobados
            System.out.println("\n===== ESTUDIANTES APROBADOS =====");

            HashMap<String, ArrayList<Double>> estudiantes =
                    registro.getEstudiantes();

            String mejorEstudiante = "";
            double mejorPromedio = -1;

            for (String nombre : estudiantes.keySet()) {

                ArrayList<Double> notas = estudiantes.get(nombre);

                if (!notas.isEmpty()) {

                    double suma = 0;

                    for (double nota : notas) {
                        suma += nota;
                    }

                    double promedio = suma / notas.size();

                    if (promedio >= 3.0) {

                        System.out.println(
                                nombre + " - Promedio: " + promedio
                        );
                    }

                    // Buscar el promedio más alto
                    if (promedio > mejorPromedio) {

                        mejorPromedio = promedio;
                        mejorEstudiante = nombre;
                    }
                }
            }

            // Mostrar mejor promedio
            System.out.println("\n===== PROMEDIO MÁS ALTO =====");

            if (mejorEstudiante.equals("")) {

                System.out.println(
                        "No hay estudiantes con notas registradas."
                );

            } else {

                System.out.println(
                        "Estudiante: " + mejorEstudiante
                );

                System.out.println(
                        "Promedio: " + mejorPromedio
                );
            }

        } catch (Exception e) {

            System.out.println(
                    "\nError: debes ingresar datos válidos."
            );

        } finally {

            scanner.close();
        }
    }
}
