package catalogo_app;

public class IPhone extends Electronico {

    private String color;
    private String modelo;

    public IPhone(String fabricante, int precio, String color, String modelo) {
        super(fabricante, precio);
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio();
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }
}
