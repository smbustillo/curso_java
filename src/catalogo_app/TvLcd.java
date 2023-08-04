package catalogo_app;

public class TvLcd extends Electronico {

    private int pulgadas;

    public TvLcd(String fabricante, int precio, int pulgadas) {
        super(fabricante, precio);
        this.pulgadas = pulgadas;
    }


    @Override
    public double getPrecioVenta() {
        return this.getPrecio();
    }

    public int getPulgadas() {
        return pulgadas;
    }
}
