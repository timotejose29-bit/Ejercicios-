public class Triangulo extends Figura {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double area() {
        double semiperimetro = perimetro() / 2;

        return Math.sqrt(
                semiperimetro *
                        (semiperimetro - lado1) *
                        (semiperimetro - lado2) *
                        (semiperimetro - lado3)
        );
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }
}
