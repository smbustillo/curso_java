import java.util.Scanner;

public class Clase9 {
    public static void main(String[] args) {
        String [] personas = {"Susana Bustillo","Lola Mosquera","Lolita Rubia","khaleesi"};

        System.out.print("Introduzca búsqueda: ");

        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.next();

        for(int indice = 0; indice < personas.length; indice++){
            String personaEncontrada = personas[indice];
            System.out.println(personaEncontrada);
        }

    }
}
