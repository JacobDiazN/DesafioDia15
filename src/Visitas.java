public class Visitas {
    public static void main(String[] args) {

        int[] visitasDiarias = convertirAEnteros(args);
        double promedio = calcularPromedio(visitasDiarias);
        System.out.println("El promedio de visitas diarias es: " + promedio);
    }

    public static int[] convertirAEnteros(String[] args) {
        int[] visitasDiarias = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            visitasDiarias[i] = Integer.parseInt(args[i]);
        }
        return visitasDiarias;
    }

    public static double calcularPromedio(int[] visitasDiarias) {
        int suma = 0;
        for (int visitas : visitasDiarias) {
            suma += visitas;
        }
        double promedio = (double) suma / visitasDiarias.length;
        return promedio;
    }
}
