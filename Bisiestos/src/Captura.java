import java.util.Scanner;
public class Captura {
    //Atributos
    private int year;

    //Métodos
    public int pedirDato(){
        Scanner readYear = new Scanner(System.in);
        System.out.println("Teclea un año en 4 dígitos");
        year = readYear.nextInt();

        return year;
    }

}

