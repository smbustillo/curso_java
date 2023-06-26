import org.jetbrains.annotations.NotNull;

public class Clase8 {
    //Ejecutar funciones hechas
    public static void main(String[] args) {
        float lado = 34.2F;
        float altura = 45.3F;

        float areaCuadrado = calcularAreaCuadrado(lado);
        float areaTriangulo = calcuarAreaTriangulo(lado,altura);

        System.out.println("El area del cuadrado es " + areaCuadrado);
        System.out.println("El area del triangulo es " + areaTriangulo);
        System.out.println("La contraseña generada es "+ generarPassword());
    }

    //Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
    private static float calcularAreaCuadrado(float lado){
        return lado*lado;
    }

    //Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.
    private static float calcuarAreaTriangulo(float base, float altura){
        return (base*altura)/2;
    }

    //Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una contraseña (por ejemplo,
    // puedes utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.
    private static @NotNull
    String generarPassword() {
        int num = (int)(Math.random()*100000);
        return "P" + num;
    }
}
