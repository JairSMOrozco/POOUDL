import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        /*
        try{
            System.out.println("Ingresa un número entero");
            num = scanner.nextInt();
            System.out.println("El número introducido es: " + num);
        }catch(Exception e){
            System.out.println("Algo salió mal, el número debe de ser entero: " + e.toString());
        }finally{
            System.out.println("Programa finalizado");
        }
        */
        do{
            try{
                System.out.println("Ingresa un número");
                num = scanner.nextInt();
                int resultado = (int)Math.pow(num, 2);
                System.out.println("El cuadrado de " + num + " es: " + resultado);
            }catch(InputMismatchException e){

            }
        }while();

    }
}