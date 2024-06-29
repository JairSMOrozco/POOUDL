public class Gallon {
    double gallonToLiterValue = 3.785;

    //Métodos
    /**Descripción de la función
     * Convierte el valor de los galones suministrados a litros usando el valor del atributo gallonToLiterValue
     * @param gallons --> Galones ingresados por usuario para convertir
     * */
    public double convertToLiters(double gallons){
        double conversionResult = gallons * gallonToLiterValue;

        return conversionResult;
    }
}
