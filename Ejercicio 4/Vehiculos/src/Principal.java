public class Principal {

    public static void main(String[] args) {

        Vehiculo[] vehiculos = {
                new Carro(),
                new Moto(),
                new Bicicleta()
        };

        for (Vehiculo vehiculo : vehiculos) {

            vehiculo.arrancar();
            vehiculo.combustible();
            vehiculo.detener();

            System.out.println("----------------------");
        }
    }
}