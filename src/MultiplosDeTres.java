public class MultiplosDeTres {
    public static void main(String[] args) {

        int[] n = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            n[i] = Integer.parseInt(args[i]);
        }

        int suma = suma(n);
        System.out.println("\n=======================================================");
        System.out.println("La suma de los números múltiplos de tres es: " + suma);
        double promedio = promedio(n);
        System.out.println("=======================================================");
        System.out.println("El promedio de los números múltiplos de 3 es: " + promedio);
        System.out.println("=======================================================\n");
    }

    public static int suma(int[] valores) {
        int suma = 0;
        for (int valor : valores) {
            if (valor % 3 == 0) {
                suma += valor;
            }
        }
        return suma;
    }

    public static double promedio(int[] valores) {
        int suma = 0;
        int contador = 0;
        for (int valor : valores) {
            if (valor % 3 == 0) {
                contador++;
                suma += valor;
            }
        }
        if (contador == 0) {
            return 0.0;
        }
        return (double) suma / contador;
    }
}
