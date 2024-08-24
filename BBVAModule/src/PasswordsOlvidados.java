import java.util.Scanner;

public class PasswordsOlvidados extends Passwords{
    //Atributos

    //Métodos

    //Método que recibe un string para poder restablecer su contraseña
    public void askUserName(){
        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario");
        String userName = scannerUser.next();

        boolean isUpper  = userName.equals(userName.toUpperCase());

        //Validación del string proporcionado
        if(userName.length() == 8 && isUpper){
            super.generatePassword(); //Si es válido hago uso de herencia para usar el método de generar pass
            userMessage();//Llamo a un método local para mostrar la nueva contraseña
        }else {
            System.out.println("Nombre de usuario no válido");
            System.out.println("El nombre debe tener 8 caracteres y estar en mayúsculas");
        }
    }

    private void userMessage(){
        System.out.println("Contraseña restablecida \n" +
                           "Su nueva contraseña es: " + super.getPassword());
        //Uso la herencia para traer la propiedad password que se seteo al crear el pasword aleatorio

    }
}
