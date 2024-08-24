import java.security.SecureRandom;
import java.util.Random;

class passwords {
    //atributos
    private String pass;

    //Este método construye de manera aleatoria la contraseña
    public void generarPass() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random passRandom = new SecureRandom();

        //StringBuilder() recibe la extensión de la palabra que se construirá, en este caso es de 8 caracteres
        StringBuilder contrasenaAleatoria = new StringBuilder(8);

        for (int i = 0; i < 8; i++) {
            int randomIndex = passRandom.nextInt(caracteres.length());
            contrasenaAleatoria.append(caracteres.charAt(randomIndex));
        }

        //El resultado de lo generado de manera aleatoria se manda a this.pass
        this.pass = contrasenaAleatoria.toString();
    }

    public String getPass() {
        return pass;
    }
}
