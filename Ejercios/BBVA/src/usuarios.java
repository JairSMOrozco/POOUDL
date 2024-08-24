import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

class usuarios {
    private String username;
    private String password;

    //No se necesita el constructor
    public usuarios(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Generar el nombre de usuario de manera aleatoria
    public void generarUsuario() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random usuarioRandom = new SecureRandom();

        //StringBuilder() recibe la extensión de la palabra que se construirá, en este caso es de 8 caracteres
        StringBuilder usuarioAleatorio = new StringBuilder(8);

        for (int i = 0; i < 8; i++) {
            int randomIndex = usuarioRandom.nextInt(letras.length());
            usuarioAleatorio.append(letras.charAt(randomIndex));
        }

        //El resultado de lo generado de manera aleatoria se manda a this.username
        this.username = usuarioAleatorio.toString();
    }

    public String getUser() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    //Lo mejor sería hacer un solo archivo para el main
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int op;

        do {
            System.out.println("Teclee la opción deseada");
            System.out.println("1.- Crear cuenta de usuario");
            System.out.println("2.- Olvidé mi contraseña");
            System.out.println("3.- Salir");

            try {
                op = leer.nextInt();
                leer.nextLine(); // Limpiar el buffer

                switch (op) {
                    case 1:
                        //Solo genera el usuario y la contraseña de manera aleatoria aquí
                        break;
                    case 2:
                        //Aquí si si se debe de ingresar un valor por el usuario.
                        //Crea aqui la instancia de passwordsOlvidados
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Por favor, intente nuevamente.");
                leer.nextLine(); // Limpiar el buffer después de la excepción
                op = 0; // Evitar que el programa salga
            }
        } while (op != 3);

        leer.close();
    }
}