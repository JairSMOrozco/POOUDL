import java.security.SecureRandom;
import java.util.Random;

public class Usuarios {
    //Atributos
    private String user;
    private String pass;

    //Métodos
    Usuarios(){}

    //Creo una instancia de Passwords en Usuarios
    Passwords password = new Passwords();

    //Método que crea usuario aleatorio y también la constraseña haciendo uso de la instancia de passwords
    public void generateUser(){
        int wordLength = 8;
        String letters = "ABCDEFGHIJKLMNOPQRSOTUVWXYZ";

        Random createRandom = new SecureRandom();

        StringBuilder randomUser = new StringBuilder(wordLength);

        for (int i = 0; i < wordLength; i++) {
            int randomIndex = createRandom.nextInt(letters.length());
            randomUser.append(letters.charAt(randomIndex));
        }

        //Almaceno el valor del string aleatorio en la propiedad user
        setUser(randomUser.toString());

        //Método que crea la contraseña haciendo uso de la instancia de passwords
        password.generatePassword();

        //Almaceno el valor del string aleatorio en la propiedad pass
        setPassword(password.getPassword());

    }

    //Getters
    public String getUser(){
        return user;
    }
    public String getPassword(){
        return pass;
    }

    //Setters
    public void setUser(String user) { this.user = user; }
    public void setPassword(String password){ this.pass = password; }
}
