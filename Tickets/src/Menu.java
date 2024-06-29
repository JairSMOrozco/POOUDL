import java.util.Scanner;

public class Menu {
    //Atributos
    private char state;
    private int tickets;

    //Métodos
    /**Descripción de la función: Muestra en consola las opciones que hay para elegir.
     * */
    public void showMenu(){
        System.out.println("Linea de autobúses ADO, seleccione su destino: ");
        System.out.println("a) Puebla.      [$150.00]");
        System.out.println("b) Veracruz.    [$320.00]");
        System.out.println("c) Tlaxcala.    [$120.00]");
        System.out.println("d) Cuernavaca.  [$ 90.00]");
        System.out.println("e) Queretaro.   [$110.00]");
    }

    /**Descripción de la función: Pide a usuario ingresar el destino.
     * El valor a ingresar debe de ser la letra de la opción.
     * @return state --> Es el valor de la opcón elegida (puede ser a,b,c,d,e)
     * */
    public char chooseState(){
        Scanner readState = new Scanner(System.in);

        state = readState.next().charAt(0);
        return state;
    }

    /**Descripción de la función Pide a usuario ingresar la cantidad de boletos a comprar
     * @return tickets --> Es el valor de la cantidad de boletos elegida.
     * */
    public int chooseTickets(){
        Scanner readTickets = new Scanner(System.in);

        System.out.println("Ingresa el número de boletos que quieres");
        tickets = readTickets.nextInt();
        return tickets;
    }

}
