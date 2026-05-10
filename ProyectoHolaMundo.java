import java.util.Scanner;
public class ProyectoHolaMundo{
    public static void main(String[] args) {
    int num1;
    int num2;
    int respuesta;
Scanner scanner = new Scanner(System.in);  

        System.out.println("Hola mundo");
        System.out.println("Bienvenidos a java");
        System.out.println("Y a Git/GitHub");

System.out.println(" ////////////////////// ");
System.out.println("");
System.out.println("Programa para sumar dos variables!!");
System.out.println("Ingresa el primer número: ");
num1 = scanner.nextInt();
System.out.println("Ingresa el segundo número: ");
num2 = scanner.nextInt();

respuesta = num1 + num2;

System.out.println("//// RESULTADO ////");
System.out.println("");
System.out.println(num1 +  " + " + num2 + " = " + respuesta);

scanner.close();
    }
}
