import java.util.ArrayList;
import java.util.List;

public class SmartWatch {
    public static void main(String[] args) {

        Integer[] pasosFiltrados = clearSteps(args);
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("Pasos diarios válidos:");
        for (int paso : pasosFiltrados) {
            System.out.print("[" + paso + "], ");
        }
        double promedio = promedio(pasosFiltrados);
        System.out.println("\n=======================================================");
        System.out.println("El promedio de pasos diarios es: " + promedio);
        System.out.println("=======================================================");
        System.out.println("");
    }

    public static Integer[] clearSteps(String[] pasos) {
        ArrayList<Integer> pasosValidos = new ArrayList<Integer>();
        for (String paso : pasos) {
            try {
                int valor = Integer.parseInt(paso);
                if (valor >= 200 && valor <= 100000) {
                    pasosValidos.add(valor);
                }
            } catch (NumberFormatException e) {
            }
        }
        Integer[] resultado = new Integer[pasosValidos.size()];
        pasosValidos.toArray(resultado);
        return resultado;
    }

    public static double promedio(Integer[] pasos) {
        if (pasos.length == 0) {
            return 0.0;
        }
        int suma = 0;
        for (int paso : pasos) {
            suma += paso;
        }
        return (double) suma / pasos.length;
    }
}


