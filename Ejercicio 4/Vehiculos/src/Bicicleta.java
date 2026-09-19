public class Bicicleta extends Vehiculo {

    @Override
    public void arrancar() {
        System.out.println("La bicicleta ha comenzado a moverse.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se ha detenido.");
    }

    @Override
    public void combustible() {
        System.out.println("La bicicleta no utiliza combustible.");
    }
}