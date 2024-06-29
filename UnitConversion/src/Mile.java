public class Mile {
    double mileToKilometerValue = 1.609;

    //Métodos
    /**Descripción de la función
     * Convierte el valor de las millas suministradas a kilómetros usando el valor del atributo mileToKilometerValue
     * @param miles --> Millas ingresadas por usuario para convertir
     * */
    public double convertToKilometers(double miles){
        double conversionResult = miles * mileToKilometerValue;

        return conversionResult;
    }
}
