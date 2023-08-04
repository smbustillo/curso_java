import java.util.Scanner;

public class JavaPrincipiantes {
    public static void main(String[] args) {

        //mostrarMayorMenorNumeros(3);
        //System.out.println("El promedio es " + calcularPromedio(ingresarNumerosInt()));
        //obtenerParImpar();
        mostrarNumerosPrimos();
    }

    private static void mostrarNumerosPrimos() {

        for(int i= 1;i<100;i++){
            if(esPrimo(i))
            System.out.print(i + "\t");
        }

    }
    private static boolean esPrimo(int num){
        for(int j=2;j<num;j++){
            if(num%j == 0)
                return false;
        }

        return true;
    }

    private static void obtenerParImpar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número ");
        int numero  = teclado.nextInt();
        System.out.println("El numero " + numero + " es " + esParImpar(numero));
    }

    private static String esParImpar(int numero) {
        if (numero%2 == 0)
            return "par";
        return "impar";
    }

    private static int[] ingresarNumerosInt() {
        int[] numeros;
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        System.out.println("Cuántos números quieres introducir? ");
        int cantidad = teclado.nextInt();
        numeros = new int[cantidad];
        do {
            System.out.println("Introduce el número entero: ");
            numeros[contador]  = teclado.nextInt();
            contador ++;
        }while(contador < cantidad);

        return numeros;
    }

    private static Double calcularPromedio(int[] numeros) {
        Double suma = 0.0;

        for(int i = 0; i<numeros.length;i++){
            suma += numeros[i];
        }

        return suma/numeros.length;
    }

    private static void mostrarMayorMenorNumeros(int cantNumeros) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int[] numeros = new int[cantNumeros];
        int mayor = 0;
        int menor = 0;

        do {
            System.out.println("Ingrese un numero: ");
            numeros[contador] = teclado.nextInt();
            if(contador == 0){
                mayor = numeros[contador];
                menor = numeros[contador];
            }
            if (numeros[contador]>mayor){
                mayor = numeros[contador];
            }

            if (numeros[contador] < menor){
                menor = numeros[contador];
            }

            contador ++;

        }while(contador<cantNumeros);

        System.out.println("El numero mayor es " + mayor);
        System.out.println("El numero menor es " + menor);
    }
}
