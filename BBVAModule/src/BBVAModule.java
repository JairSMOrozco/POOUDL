import java.util.InputMismatchException;
import java.util.Scanner;

public class BBVAModule {
    public static void main(String[] args) {

        while(true){

            int selectedOption = 0;
            boolean isOptionCorrect = false;

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
                    switch (selectedOption){
                        case 1,2,3:
                            isOptionCorrect = true;
                            break;
                        default:
                            System.out.println("Ingresa una opción válida");
                            isOptionCorrect = false;
                            break;
                    }

                }catch(InputMismatchException event){
                    System.out.println("No se admiten caracteres, ingresa una opción válida");
                }

            }while(!isOptionCorrect);



            //Lógica de negocio. Llamado a objetos
            switch(selectedOption){
                case 1:
                    Usuarios user = new Usuarios();
                    user.generateUser();

                    System.out.println("Creación de usuario");
                    System.out.println("Usuario: " + user.getUsuario());
                    System.out.println("Contraseña: " + user.getPassword());
                    break;
                case 2:
                    PasswordsOlvidados forgetPassword = new PasswordsOlvidados();
                    Scanner scannerUser = new Scanner(System.in);
                    System.out.println("Ingrese el nombre de usuario");
                    String userName = scannerUser.next();

                    forgetPassword.askUserName(userName);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
            }

        }
    }
}