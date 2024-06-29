public class Fahrenheit {

    //Métodos
    /**Descripción de la función
     * Convierte el valor de los grados Fahrenheit suministrados a grados centígrados usando la fórmula (F - 32) / 1.8
     * @param fahrenheit --> Grados Fahrenheit ingresados por usuario para convertir
     * */
    public double convertToCelsius(double fahrenheit){
        double conversionResult = (fahrenheit - 32) / 1.8;

        return conversionResult;
    }
}
