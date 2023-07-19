public class Cuenta {

    private String titular;
    private Double cantidad = 0.0;

    public Cuenta(){};

    public void mostrar(){
        System.out.println("Datos de la cuenta....");
        System.out.println("Titular: " + titular);
        System.out.println("Cantidad: " + cantidad);
    }

    public void ingresar(Double cantidad){
        if(cantidad>0){
            this.cantidad += cantidad;
        }
    }

    public void retirar(Double cantidad){
        if(cantidad>0){
            this.cantidad -= cantidad;
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
}
