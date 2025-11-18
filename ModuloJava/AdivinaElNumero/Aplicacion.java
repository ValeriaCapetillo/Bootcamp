import clases.AdivinaNumero;
import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args) {
        int numeroSecreto = (int)(Math.random() * 100) + 1;
        ArrayList<Integer> intentos = new ArrayList<>();
        boolean adivinado = false;

        System.out.println("Por favor ingresa un número entre 1 - 100 para adivinar.");

        while (!adivinado) {
            System.out.print("> ");
            // Usar Scanner si System.console() falla en tu entorno.
            String linea = System.console().readLine();
            int num = Integer.parseInt(linea);
            intentos.add(num);

            String mensaje = AdivinaNumero.compararNumeros(num, numeroSecreto);
            System.out.println(mensaje);

            if (num == numeroSecreto) {
                adivinado = true;
                System.out.println("Te tomó " + intentos.size() + " veces adivinar el número.");
                for (int intento : intentos) {
                    System.out.print(intento + " ");
                }
                System.out.println();
            }
        }
    }
}
