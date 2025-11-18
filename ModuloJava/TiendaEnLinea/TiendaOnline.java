public class TiendaOnline {
    public static void main(String[] args) {
        // VARIABLES DE LA TIENDA
        // Mensajes de la aplicación
        String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
        String mensajeConfirmacion = ", tu pedido ha sido confirmado";
        String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
        String mensajeMostrarTotal = "El total de tu compra es: $";
       
        // Variables de productos
        double precioLibro = 15.99;
        double precioCamiseta = 25.50;
        double precioPantalones = 45.00;
        double precioZapatos = 60.00;
        
        // Nombres de productos
        String nombreLibro = "Libro";
        String nombreCamiseta = "Camiseta";
        String nombrePantalones = "Pantalones";
        String nombreZapatos = "Zapatos";
   
        // Variables de clientes
        String cliente1 = "Ana";
        String cliente2 = "Alex";
        String cliente3 = "Miguel";
   
        // Estado de pedidos
        boolean pedidoConfirmadoCliente1 = true;
        boolean pedidoConfirmadoCliente2 = true;
        boolean pedidoConfirmadoCliente3 = true;
        
        // Detalles de pedidos
        String pedidoAna = nombrePantalones;
        String pedidoMiguel = nombreZapatos + " y " + nombreLibro;
        String pedidoAlex = "2 pares de " + nombreZapatos + ", " + nombreCamiseta + " y " + nombrePantalones;
   
        // INTERACCIÓN DE LA APLICACIÓN
        System.out.println(mensajeBienvenida + cliente1);
       
        // Ana ha pedido un pantalón
        if (pedidoConfirmadoCliente1) {
            System.out.println(cliente1 + ", tu pedido de " + pedidoAna + " ($" + precioPantalones + ") ha sido confirmado");
        } else {
            System.out.println(cliente1 + mensajeRechazo);
        }
       
        System.out.println();
       
        // Miguel ha pedido unos zapatos y un libro
        System.out.println(mensajeBienvenida + cliente3);
        double totalMiguel = precioZapatos + precioLibro;
        if (pedidoConfirmadoCliente3) {
            System.out.println(cliente3 + ", tu pedido " + pedidoMiguel + " ha sido confirmado");
        } else {
            System.out.println(cliente3 + mensajeRechazo);
        }
       
        System.out.println();
       
        // Alex ha comprado 2 pares de zapatos, una camiseta y unos pantalones
        System.out.println(mensajeBienvenida + cliente2);
        double totalAlex = (precioZapatos * 2) + precioCamiseta + precioPantalones;
        System.out.println("Pedido: " + pedidoAlex);
        System.out.println(mensajeMostrarTotal + totalAlex);
        if (pedidoConfirmadoCliente2) {
            System.out.println(cliente2 + mensajeConfirmacion);
        } else {
            System.out.println(cliente2 + mensajeRechazo);
        }
       
        System.out.println();
       
        // Miguel se ha dado cuenta que le cobraron unos pantalones y una camiseta
        double pedidoErroneoMiguel = (precioZapatos + precioLibro + precioPantalones + precioCamiseta);
        double pedidoCorrectoMiguel = (precioZapatos + precioLibro);
        double diferencia = (pedidoErroneoMiguel - pedidoCorrectoMiguel);
        System.out.println("Miguel, se te había cobrado de más: " + pedidoErroneoMiguel+ "La diferencia es: $" + diferencia);
        System.out.println("Tu nuevo total correcto es: $" + pedidoCorrectoMiguel);
    }
}
