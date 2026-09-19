public class Main {

    public static void main(String[] args) {

        InstrumentoMusical[] instrumentos = {
                new Guitarra(),
                new Piano()
        };

        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.tocar();
            instrumento.afinar();
        }
    }
}