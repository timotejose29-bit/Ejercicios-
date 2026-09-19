public class Guitarra implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("La guitarra está tocando");
    }

    @Override
    public void afinar() {
        System.out.println("La guitarra está afinándose");
    }
}