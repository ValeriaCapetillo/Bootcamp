import clases.Algoritmos;

public class Aplicacion {
    
    public static void main(String[] args) {
        
        System.out.println("=== Prueba esPar() ===");
        System.out.println("¿Es 4 par? " + Algoritmos.esPar(4));
        System.out.println("¿Es 7 par? " + Algoritmos.esPar(7));
        System.out.println();
        
        System.out.println("=== Prueba esPrimo() ===");
        System.out.println("¿Es 7 primo? " + Algoritmos.esPrimo(7));
        System.out.println("¿Es 10 primo? " + Algoritmos.esPrimo(10));
        System.out.println("¿Es 13 primo? " + Algoritmos.esPrimo(13));
        System.out.println();
        
        System.out.println("=== Prueba stringEnReversa() ===");
        System.out.println("Hola en reversa: " + Algoritmos.stringEnReversa("Hola"));
        System.out.println("Java en reversa: " + Algoritmos.stringEnReversa("Java"));
        System.out.println();
        
        System.out.println("=== Prueba esPalindromo() ===");
        System.out.println("¿Es 'radar' palíndromo? " + Algoritmos.esPalindromo("radar"));
        System.out.println("¿Es 'hola' palíndromo? " + Algoritmos.esPalindromo("hola"));
        System.out.println("¿Es 'oso' palíndromo? " + Algoritmos.esPalindromo("oso"));
        System.out.println();
        
        System.out.println("=== Prueba secuenciaFizzBuzz(15) ===");
        Algoritmos.secuenciaFizzBuzz(15);
    }
}
