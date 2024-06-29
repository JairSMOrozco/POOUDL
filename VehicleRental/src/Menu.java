import java.util.Scanner;

public class Menu {
    //Atributos
    private int vehicle;

    //Métodos
    /**Descripción de la función: Muestra en consola las opciones que hay para elegir.
     * */
    public void showMenu(){
        System.out.println("Selecciona una opción para tu viaje");
        System.out.println("1) Motocicleta");
        System.out.println("2) Automóvil");
        System.out.println("3) Camioneta Pickup");
    }

    /**Descripción de la función: Guarda el valor seleccionado por usuario y lo regresa a la función main
     *
     * @return vehicle --> Tiene el valor seleccionado por usuario.
     * */
    public int chooseVehicle(){
        Scanner readVehicle = new Scanner(System.in);

        vehicle = readVehicle.nextInt();
        return vehicle;
    }

}
