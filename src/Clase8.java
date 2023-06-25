public class Clase8 {
    public static void main(String[] args) {
        float lado = 34.2F;
        float areaCuadrado = calcularAreaCuadrado(lado);

        System.out.println("El area del cuadrado es " + areaCuadrado);
    }
    //Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
    private static float calcularAreaCuadrado(float lado){
        return lado*lado;
    }
}
