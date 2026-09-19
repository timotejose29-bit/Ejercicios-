import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Figura[] figuras = new Figura[3];

        try {

            System.out.println("=== CIRCULO ===");
            System.out.print("Ingrese el radio: ");
            double radio = scanner.nextDouble();

            figuras[0] = new Circulo(radio);

            System.out.println("\n=== RECTANGULO ===");
            System.out.print("Ingrese la base: ");
            double base = scanner.nextDouble();

            System.out.print("Ingrese la altura: ");
            double altura = scanner.nextDouble();

            figuras[1] = new Rectangulo(base, altura);

            System.out.println("\n=== TRIANGULO ===");
            System.out.print("Ingrese el lado 1: ");
            double lado1 = scanner.nextDouble();

            System.out.print("Ingrese el lado 2: ");
            double lado2 = scanner.nextDouble();

            System.out.print("Ingrese el lado 3: ");
            double lado3 = scanner.nextDouble();

            figuras[2] = new Triangulo(lado1, lado2, lado3);

            System.out.println("\n============================");
            System.out.println("      RESULTADOS");
            System.out.println("============================");

            int contador = 1;

            for (Figura figura : figuras) {

                System.out.println("\nFigura " + contador);
                System.out.println("Área: " + figura.area());
                System.out.println("Perímetro: " + figura.perimetro());

                contador++;
            }

        } catch (Exception e) {

            System.out.println("\nError: debes ingresar solamente números.");

        } finally {

            scanner.close();
        }
    }
}
