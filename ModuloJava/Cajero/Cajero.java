import java.util.Date;

public class Cajero {
    
    // MÉTODO MAIN - AL INICIO
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DEL CAJERO ===\n");
        
        // Prueba 1: Retirar dinero
        System.out.println("--- Retirar Dinero ---");
        System.out.println(retirarDinero(5000));
        System.out.println(retirarDinero(9000));
        System.out.println(retirarDinero(8000));
        System.out.println();
        
        // Prueba 2: Pagar factura
        System.out.println("--- Pagar Factura ---");
        System.out.println(pagarFactura(1000, 500));
        System.out.println(pagarFactura(1000, 1000));
        System.out.println(pagarFactura(1000, 1500));
        System.out.println();
        
        // Prueba 3: Cambiar billetes
        System.out.println("--- Cambiar Billetes ---");
        System.out.println("¿Se puede cambiar 2000 en billetes de 50? " + cambiarBilletes(2000, 50));
        System.out.println("¿Se puede cambiar 2010 en billetes de 50? " + cambiarBilletes(2010, 50));
        System.out.println();
        
        // Prueba 4: Total de billetes y monedas
        System.out.println("--- Total de Billetes y Monedas ---");
        System.out.println("1999: " + totalDeBilletesYMonedas(1999));
        System.out.println("8347: " + totalDeBilletesYMonedas(8347));
        System.out.println("500: " + totalDeBilletesYMonedas(500));
    }
    
    // MÉTODOS ESTÁTICOS - DESPUÉS DEL MAIN
    
    // Método para retirar dinero
    public static String retirarDinero(double cantidad) {
        if (cantidad > 8000) {
            return "Estás tratando de retirar mucho dinero, el límite es $8000";
        } else {
            return "Retiraste exitosamente la cantidad de $" + cantidad;
        }
    }
    
    // Método para pagar factura
    public static String pagarFactura(double totalFactura, double cantidadPagada) {
        Date fechaActual = new Date();
        
        if (cantidadPagada < totalFactura) {
            double faltante = totalFactura - cantidadPagada;
            return "El día de " + fechaActual + " pagaste $" + cantidadPagada + 
                   " aún te hacen falta $" + faltante;
        } else if (cantidadPagada == totalFactura) {
            return "Gracias por tu pago completo el día de " + fechaActual;
        } else {
            double cambio = cantidadPagada - totalFactura;
            return "Gracias por tu pago el día de " + fechaActual + 
                   ", tu cambio es de $" + cambio;
        }
    }
    
    // Método para cambiar billetes
    public static boolean cambiarBilletes(int cantidadTotal, int denominacion) {
        return cantidadTotal % denominacion == 0;
    }
    
    // Método para calcular total de billetes y monedas
    public static String totalDeBilletesYMonedas(int cantidad) {
        String resultado = "";
        int cantidadRestante = cantidad;
        
        // Billetes
        int billetes500 = cantidadRestante / 500;
        cantidadRestante = cantidadRestante % 500;
        
        int billetes200 = cantidadRestante / 200;
        cantidadRestante = cantidadRestante % 200;
        
        int billetes100 = cantidadRestante / 100;
        cantidadRestante = cantidadRestante % 100;
        
        int billetes50 = cantidadRestante / 50;
        cantidadRestante = cantidadRestante % 50;
        
        int billetes20 = cantidadRestante / 20;
        cantidadRestante = cantidadRestante % 20;
        
        // Monedas
        int monedas10 = cantidadRestante / 10;
        cantidadRestante = cantidadRestante % 10;
        
        int monedas5 = cantidadRestante / 5;
        cantidadRestante = cantidadRestante % 5;
        
        int monedas2 = cantidadRestante / 2;
        cantidadRestante = cantidadRestante % 2;
        
        int monedas1 = cantidadRestante;
        
        // Construir el resultado
        if (billetes500 > 0) {
            resultado += billetes500 + " billetes de 500, ";
        }
        if (billetes200 > 0) {
            resultado += billetes200 + " billetes de 200, ";
        }
        if (billetes100 > 0) {
            resultado += billetes100 + " billetes de 100, ";
        }
        if (billetes50 > 0) {
            resultado += billetes50 + " billete(s) de 50, ";
        }
        if (billetes20 > 0) {
            resultado += billetes20 + " billete(s) de 20, ";
        }
        if (monedas10 > 0) {
            resultado += monedas10 + " moneda(s) de 10, ";
        }
        if (monedas5 > 0) {
            resultado += monedas5 + " moneda(s) de 5, ";
        }
        if (monedas2 > 0) {
            resultado += monedas2 + " moneda(s) de 2, ";
        }
        if (monedas1 > 0) {
            resultado += monedas1 + " moneda(s) de 1";
        }
        
        // Eliminar la última coma y espacio si existe
        if (resultado.endsWith(", ")) {
            resultado = resultado.substring(0, resultado.length() - 2);
        }
        
        return resultado;
    }
}
