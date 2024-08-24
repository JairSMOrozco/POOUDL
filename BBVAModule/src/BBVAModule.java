import java.util.InputMismatchException;
import java.util.Scanner;

public class BBVAModule {
    public static void main(String[] args) {

        while(true){
            //Almacena el valor de la opción seleccionada
            int selectedOption = 0;
            boolean isOptionCorrect = false; //Almacena la verificación de la opción seleccionada

            do {
                //Menu
                System.out.println("Teclee la opción deseada");
                System.out.println("1.- Crear cuenta de usuario");
                System.out.println("2.- Olvide mi contraseña");
                System.out.println("3.- Salir");

                try{
                    Scanner scanner = new Scanner(System.in);
                    selectedOption = scanner.nextInt();

                    //Valida si la opción elegida está en el menú
                    //Puedo ponerlo en una función aparte
                    switch (selectedOption){
                        case 1,2,3:
                            isOptionCorrect = true;
                            break;
                        default:
                            System.out.println("Ingresa una opción válida");
                            isOptionCorrect = false;
                            break;
                    }

                }catch(InputMismatchException event){ //Si la opción es un tipo diferente a integer maneja la excepción
                    System.out.println("No se admiten caracteres, ingresa una opción válida");
                }

            }while(!isOptionCorrect);

            //Lógica de negocio.
            switch(selectedOption){
                case 1:
                    Usuarios user = new Usuarios();
                    //Crea el usuario y la contraseña de manera aleatoria
                    user.generateUser();

                    //Imprime en pantalla el usuario y la contraseña
                    System.out.println("Creación de usuario");
                    System.out.println("Usuario: " + user.getUser());
                    System.out.println("Contraseña: " + user.getPassword());
                    break;
                case 2:
                    PasswordsOlvidados forgetPassword = new PasswordsOlvidados();
                    forgetPassword.askUserName();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
            }
            //selectedOption = 0;
        }
    }
}