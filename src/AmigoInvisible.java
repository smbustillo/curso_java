import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AmigoInvisible {

    public static void main(String[] args) {
        jugarAmigoInvisible();

    }

    private static void jugarAmigoInvisible() {
        //ingresar nombre participantes
        String[] participantes;
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántas personas van a participar?");
        int cantPersonas  = teclado.nextInt();
        participantes = new String[cantPersonas];
        List<String> listAux  = new ArrayList<>();

        cargaArrayJugadores(participantes, teclado, cantPersonas, listAux);

        //cargamos a los agasajados
        String[] agasajados = getAgasajados(participantes, cantPersonas, listAux);

        //mostrar resultados
        mostrarResultados(participantes, teclado, cantPersonas, agasajados);
    }

    private static void cargaArrayJugadores(String[] participantes, Scanner teclado, int cantPersonas, List<String> listAux) {
        for(int i = 0; i< cantPersonas; i++){
            System.out.println("Participante " + (i + 1) + ": ");
            participantes[i] = teclado.next();
            listAux.add(participantes[i]);
        }
    }

    @NotNull
    private static String[] getAgasajados(String[] participantes, int cantPersonas, List<String> listAux) {
        String [] agasajados = new String[cantPersonas];
        int ind = 0;
        while(ind< cantPersonas){
            Random rnd = new Random();
            int indiceRandom = rnd.nextInt(cantPersonas);

            //comprobamos que no es el mismo
            if(!participantes[indiceRandom].equalsIgnoreCase(participantes[ind])){
                //comprobamos que no se ha elegido antes
                if(listAux.contains(participantes[indiceRandom])){
                    agasajados[ind]= participantes[indiceRandom];
                    listAux.remove(participantes[indiceRandom]);
                    ind++;

                    //comprobamos que no quede una persona y coincida con la persona que queda (bucle)
                    if(listAux.size() == 1 && listAux.contains(participantes[ind])){
                        listAux.add(participantes[indiceRandom]);
                        ind--;
                    }
                }

            }
        }
        return agasajados;
    }

    private static void mostrarResultados(String[] participantes, Scanner teclado, int cantPersonas, String[] agasajados) {
        for(int i = 0; i< cantPersonas; i++){
            System.out.println(participantes[i] + " que se acerque y pulsa una tecla y ENTER");
            teclado.next();
            System.out.print("La persona agasajada por tí es..." + agasajados[i] + "\n");
            System.out.println("Pulsa una tecla y luego ENTER para limpiar la pantalla");
            teclado.next();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }
}
