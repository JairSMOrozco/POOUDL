import java.security.SecureRandom;
import java.util.Random;

public class Passwords {
    //Atributos
    private String password;

    //Métodos

    //Genera la contraseña de manera aleatoria
    public void generatePassword(){
        int wordLength = 8;
        String characters = "ABCDEFGHIJKLMNOPQRSOTUVWXYZ1234567890";

        Random createRandom = new SecureRandom();

        StringBuilder randomPassword = new StringBuilder(wordLength);

        for (int i = 0; i < wordLength; i++) {
            int randomIndex = createRandom.nextInt(characters.length());
            randomPassword.append(characters.charAt(randomIndex));
        }

        //Almaceno el valor del string aleatorio en la propiedad password
        setPassword(randomPassword.toString());

    }

    //Getters
    public String getPassword(){
        return password;
    }

    //Setters
    public void setPassword(String pass){ this.password = pass; }
}
