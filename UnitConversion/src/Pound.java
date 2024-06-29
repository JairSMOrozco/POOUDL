public class Pound {
    double poundToKiloValue = 0.454;

    //Métodos
    /**Descripción de la función
     * Convierte el valor de las libras suministradas a kilogramos usando el valor del atributo poundToKiloValue
     * @param pounds --> Libras ingresadas por usuario para convertir
     * */
    public double convertToKilograms(double pounds){
        double conversionResult = pounds * poundToKiloValue;

        return conversionResult;
    }
}
