public class Result {
    //Métodos
    /**Descripcón de la función
     * Muestra en consola el resultado del cálculo de la conversión seleccionada.
     * La respuesta se adapta a la opción elegida por lo que necesita recibir la conversión seleccionada.
     * @param selectedOption --> Es la figura seleccionada por usuario desde le menú principal
     * @param result --> Es el cálculo hecho por el respectivo objeto al que la figura pertenece
     * */
    public void showResultConversion(int selectedOption, double conversion, double result){
        switch (selectedOption){
            case 1:
                poundsToKilogramsResult(conversion, result);
                break;
            case 2:
                milesToKilometersResult(conversion, result);
                break;
            case 3:
                gallonsToLitersResult(conversion, result);
                break;
            case 4:
                fharenheitToCelsiusResult(conversion, result);
                break;
        }
    }

    /**Descripcón de la función
     * Imprime el resultado de la conversión libras a kilogramos
     * @param result --> Es el resultado de la conversión
     * */
    private void poundsToKilogramsResult(double captureData, double result){
        System.out.println(captureData + " libras son iguales a " + result + " kilogramos" );
    }

    /**Descripcón de la función
     * Imprime el resultado de la conversión millas a kilómetros
     * @param result --> Es el resultado de la conversión
     * */
    private void milesToKilometersResult(double captureData, double result){
        System.out.println(captureData + " millas son iguales a " + result + " kilómetros" );
    }

    /**Descripcón de la función
     * Imprime el resultado de la conversión galones a litros
     * @param result --> Es el resultado de la conversión
     * */
    private void gallonsToLitersResult(double captureData, double result){
        System.out.println(captureData + " galones son iguales a " + result + " litros" );
    }

    /**Descripcón de la función
     * Imprime el resultado de la conversión grados fharenheit a grados centígrados
     * @param result --> Es el resultado de la conversión
     * */
    private void fharenheitToCelsiusResult(double captureData, double result){
        System.out.println(captureData + " grados Fharenheit son iguales a " + result + " grados centígrados" );
    }
}
