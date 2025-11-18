package clases;

public class AdivinaNumero {
    public static String compararNumeros(int usuario, int secreto) {
        if (usuario == secreto) {
            return "¡Has conseguido adivinar el número!";
        } else if (usuario < secreto) {
            return "Intenta con un número más grande.";
        } else {
            return "Intenta con un número más pequeño.";
        }
    }
}
