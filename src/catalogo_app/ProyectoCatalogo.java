package catalogo_app;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        IProducto[] productos = new Producto[4];

        productos[0] = new Comics(12, new Date(),"autor",
                "Katana","Blaki","Nimona");
        productos[1] = new IPhone("apple",999,"azul","13 pro");
        productos[2] = new Libro(45,new Date(), "Nadia",
                "LAs horas","Burguera");
        productos[3] = new TvLcd("Samsung",300,50);

        System.out.println("mostramos datos guardados:");
        Comics comic = (Comics) productos[0];
        System.out.println("El comic " + comic.getTitulo() + " tiene un precio de " + comic.getPrecioVenta());
        IPhone movil = (IPhone) productos[1];
        System.out.println("El móvil " + movil.getModelo() + " tiene un precio de " + movil.getPrecioVenta());
        Libro libro = (Libro) productos[2];
        System.out.println("El libro " + libro.getTitulo() + " tiene un precio de " + libro.getPrecioVenta());
        TvLcd tv = (TvLcd) productos[3];
        System.out.println("El tv " + tv.getFabricante() + " tiene un precio de " + tv.getPrecioVenta());

    }
}
