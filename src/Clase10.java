public class Clase10 {
    public static void main(String[] args) {
        Cuenta c = new Cuenta();

        c.ingresar(200.00);
        c.setTitular("smbustillo");
        c.mostrar();

        c.retirar(100.0);


        c.mostrar();
    }
}
