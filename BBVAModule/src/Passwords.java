import java.security.SecureRandom;
import java.util.Random;

public class Passwords {
    //Atributos
    private String password;

    //Métodos
    public void generatePassword(){
        int wordLength = 8;
        String characters = "ABCDEFGHIJKLMNOPQRSOTUVWXYZ1234567890";

        Random createRandom = new SecureRandom();

        StringBuilder randomPassword = new StringBuilder(wordLength);

        for (int i = 0; i < wordLength; i++) {
            int randomIndex = createRandom.nextInt(characters.length());
            randomPassword.append(characters.charAt(randomIndex));
        }

        this.password = randomPassword.toString();

    }

    public String getPassword(){
        return password;
    }
}
