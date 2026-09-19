public class Piano implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("El piano está tocando");
    }

    @Override
    public void afinar() {
        System.out.println("El piano está afinándose");
    }
}