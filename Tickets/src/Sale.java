public class Sale {
    //Atributos
    private String selectedState;
    private String distanceAndPrice;

    //Métodos

    /**Descripción de la función
     * Según el estado elegido se manda el número de boletos y se hacen los calculos para sacar el total del viaje.
     * @param state --> Es una letra (char) que dirá a que estado hay que mandar los boletos
     * @param tickets --> Número de boletos para hacer los cálculos según los valores de cada estado
     * @return distanceAndPrice --> Resultado de los cálculos hechos
     * */
    public String totalCost(char state, int tickets){
        selectedState = stateAssign(state);

        //Instancias de State
        State puebla = new State();
        State veracruz = new State();
        State tlaxcala = new State();
        State cuernavaca = new State();
        State queretaro = new State();

        switch (selectedState){
            case "Puebla":
                puebla.name = selectedState;
                puebla.ticketPrice = 150.00;
                puebla.timeTravel = 2;
                distanceAndPrice = puebla.calculateInfoTravel(tickets);
                break;
            case "Veracruz":
                veracruz.name = selectedState;
                veracruz.ticketPrice = 320.00;
                veracruz.timeTravel = 6.5;
                distanceAndPrice = veracruz.calculateInfoTravel(tickets);
                break;
            case "Tlaxcala":
                tlaxcala.name = selectedState;
                tlaxcala.ticketPrice = 120.00;
                tlaxcala.timeTravel = 2;
                distanceAndPrice = tlaxcala.calculateInfoTravel(tickets);
                break;
            case "Cuernavaca":
                cuernavaca.name = selectedState;
                cuernavaca.ticketPrice = 90.00;
                cuernavaca.timeTravel = 2;
                distanceAndPrice = cuernavaca.calculateInfoTravel(tickets);
                break;
            case "Queretaro":
                queretaro.name = selectedState;
                queretaro.ticketPrice = 110.00;
                queretaro.timeTravel = 3;
                distanceAndPrice = queretaro.calculateInfoTravel(tickets);
                break;
        }

        return distanceAndPrice;
    }

    /**Descripción de la función
     * En base a un char cambia a string y asigna un estado
     * @param state --> Es el char que captura el usuario
     * @return selectedState --> Contiene un String con el valor del estado elegido
     * */
    private String stateAssign(char state){

        String selectedState = "";

        switch (state){
            case 'a': selectedState = "Puebla";
                break;
            case 'b': selectedState = "Veracruz";
                break;
            case 'c': selectedState = "Tlaxcala";
                break;
            case 'd': selectedState = "Cuernavaca";
                break;
            case 'e': selectedState = "Queretaro";
                break;
            default:
                break;
        }

        return selectedState;

    }

}
