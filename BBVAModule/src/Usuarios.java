import java.security.SecureRandom;
import java.util.Random;

public class Usuarios {
    //Atributos
    private String user;
    private String pass;

    //Métodos
    Usuarios(){}

    //Tengo que usar la clase Passwords aquí
    Passwords password = new Passwords();


    public void generateUser(){
        int wordLength = 8;
        String letters = "ABCDEFGHIJKLMNOPQRSOTUVWXYZ";

        Random createRandom = new SecureRandom();

        StringBuilder randomUser = new StringBuilder(wordLength);

        for (int i = 0; i < wordLength; i++) {
            int randomIndex = createRandom.nextInt(letters.length());
            randomUser.append(letters.charAt(randomIndex));
        }

        this.user = randomUser.toString();

        password.generatePassword();

        this.pass = password.getPassword();

    }

    public String getUsuario(){
        return user;
    }

    public String getPassword(){
        return pass;
    }
}
