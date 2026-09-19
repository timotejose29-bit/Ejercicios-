import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro[] libros = new Libro[5];

        for (int i = 0; i < libros.length; i++) {

            System.out.println("\n===== LIBRO " + (i + 1) + " =====");

            System.out.print("Ingrese el título: ");
            String titulo = sc.nextLine();

            System.out.print("Ingrese el autor: ");
            String autor = sc.nextLine();

            System.out.print("Ingrese el año de publicación: ");
            int anio = sc.nextInt();

            sc.nextLine();

            libros[i] = new Libro(titulo, autor, anio);
        }

        System.out.println("\n===== INFORMACIÓN DE LOS LIBROS =====");

        for (int i = 0; i < libros.length; i++) {
            System.out.println("\nLibro " + (i + 1));
            libros[i].mostrarInformacion();
        }


        System.out.println("\n===== BUSCAR LIBRO =====");

        System.out.print("Ingrese el título que desea buscar: ");
        String tituloBuscar = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < libros.length; i++) {

            if (libros[i].getTitulo().equalsIgnoreCase(tituloBuscar)) {

                System.out.println("\nLibro encontrado:");
                libros[i].mostrarInformacion();

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún libro con ese título.");
        }


        System.out.println("\n===== LIBRO MÁS ANTIGUO =====");

        Libro libroAntiguo = libros[0];

        for (int i = 1; i < libros.length; i++) {

            if (libros[i].getAnioPublicacion() < libroAntiguo.getAnioPublicacion()) {
                libroAntiguo = libros[i];
            }
        }

        System.out.println("El libro más antiguo es:");
        libroAntiguo.mostrarInformacion();

        sc.close();
    }
}