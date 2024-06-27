public class Verification {
    //Atributos
    private boolean isDataCorrect;
    private boolean isStateCorrect;
    private boolean areTicketsCorrect;

    //Métodos
    /**Descripción de la función: Verifica que el estado elegido se encuentre dentro de la lista de opciones
     * @param state --> Es el estado a evaluar. Es el char que se recibe en el método dataVerification()
     * */
    private void stateVerification(char state){

        switch (state){
            case 'a': isStateCorrect = true;
                break;
            case 'b': isStateCorrect = true;
                break;
            case 'c': isStateCorrect = true;
                break;
            case 'd': isStateCorrect = true;
                break;
            case 'e': isStateCorrect = true;
                break;
            default:
                System.out.println("La opción ingresada como destino no es válida");
                System.out.println("Intenta de nuevo");
                isStateCorrect = false;
                break;
        }


    }

    /**Descripción de la función: Verifica que el número de boletos sea una cantidad válida.
     * @param tickets --> Es el número de boletos ingresados. Se recibe desde el método dataVerification()
     * */
    private void ticketsVerification(int tickets){
        if (tickets > 0){
            areTicketsCorrect = true;
        }else {
            System.out.println("El número de boletos no puede ser 0 o menor a 0");
            System.out.println("Intenta de nuevo");
            areTicketsCorrect = false;
        }
    }

    /**Descripción de la función: Hace las verificaciones de estado y boletos.
     * @param state --> Es la letra seleccionada del menú de opciones
     * @param tickets --> Es el número de boletos que se quieren comprar
     * @return isDataCorrect --> Boolean que indica si los datos son válidos o hay que volver a ingresar uno nuevo.
     * @see #stateVerification(char)
     * @see #ticketsVerification(int)
     * */
    public boolean dataVerification(char state, int tickets) {

        stateVerification(state);
        ticketsVerification(tickets);

        isDataCorrect = isStateCorrect && areTicketsCorrect;

        return isDataCorrect;
    }
}
