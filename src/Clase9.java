import java.util.Locale;
import java.util.Scanner;

public class Clase9 {
    public static void main(String[] args) {
        String personaEncontrada="";
        String [] personas = {"Susana Bustillo","Lola Mosquera","Lolita Rubia","khaleesi"};

        System.out.print("Introduzca búsqueda: ");

        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.nextLine();

        for(int indice = 0; indice < personas.length; indice++){
            if(personas[indice].toLowerCase(Locale.ROOT).contains(busqueda.toLowerCase(Locale.ROOT))){
                personaEncontrada = personas[indice];
            }
        }

        System.out.print("La persona es: ");
        System.out.println(personaEncontrada);
    }
}
