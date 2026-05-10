import java.util.Scanner;
public class ProyectoHolaMundo{
    public static void main(String[] args) {
    double num1;
    double num2;
    double respuesta;
Scanner scanner = new Scanner(System.in);  

        System.out.println("Hola mundo");
        System.out.println("Bienvenidos a java");
        System.out.println("Y a Git/GitHub");

System.out.println(" ////////////////////// ");
System.out.println("");
System.out.println("Programa para sumar dos variables!!");
System.out.println("Ingresa el primer número: ");
num1 = scanner.nextDouble();
System.out.println("Ingresa el segundo número: ");
num2 = scanner.nextDouble();

respuesta = num1 + num2;
System.out.println("La suma de " + num1 +  "y " + num2 + "es: " + respuesta);
    }
}
