import java.util.ArrayList;
import java.util.HashMap;

public class RegistroNotas {

    private HashMap<String, ArrayList<Double>> estudiantes;

    public RegistroNotas() {
        estudiantes = new HashMap<>();
    }

    public void agregarEstudiante(String nombre) {

        if (!estudiantes.containsKey(nombre)) {
            estudiantes.put(nombre, new ArrayList<Double>());
        }
    }

    public void agregarNota(String nombre, double nota) {

        if (estudiantes.containsKey(nombre)) {
            estudiantes.get(nombre).add(nota);
        }
    }

    public boolean existeEstudiante(String nombre) {
        return estudiantes.containsKey(nombre);
    }

    public boolean tieneNotas(String nombre) {
        return !estudiantes.get(nombre).isEmpty();
    }

    public double calcularPromedio(String nombre) {

        ArrayList<Double> notas = estudiantes.get(nombre);

        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.size();
    }

    public HashMap<String, ArrayList<Double>> getEstudiantes() {
        return estudiantes;
    }
}
