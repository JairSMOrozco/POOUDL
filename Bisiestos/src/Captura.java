import java.util.Scanner;

public class Captura {
    //Atributos
    private int year;

    //Métodos
    /**Descripción de la función
     * Pide a usuario ingresar un año en 4 digitos
     * @return year --> Es el dato que se evaluará si es bisiesto o no
     * */
    public int pedirDato(){
        Scanner readYear = new Scanner(System.in);
        System.out.println("Teclea un año en 4 dígitos");
        year = readYear.nextInt();

        return year;
    }

}

