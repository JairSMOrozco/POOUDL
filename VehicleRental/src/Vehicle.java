public class Vehicle {
    //Atributos
    private String totalRentalCost;
    public String vehicleType;
    public double vehiclePerformance;
    public double defaultTip = .5;
    public double defaultBusiness = .3;
    public double defaultTaxes = .05;

    //Métodos

    /**Descripción de la función
     * Reune todos los calculos para sacar el costo total de renta y los reune para devolver dicho valor
     * @param distance --> Es la distancia que se tiene como referencia para calcular gasto de gasolina
     * @param gasPrice --> Es el precio de la gasolina para calcular gasto de gasolina
     * @return totalRentalCost --> Es el costo total por la renta del vehiculo
     * */
    public String getTotalRentalCost(double distance, double gasPrice){
        double gasoline = calculateGasCost(distance, gasPrice, vehiclePerformance);
        double totalTip = calculateTipCost(gasoline, defaultTip);
        double totalBusiness = calculateBusinessCost(gasoline, defaultBusiness);
        double totalTaxes = calculateTaxesCost(gasoline, defaultTaxes);

        double total = gasoline + totalTip + totalBusiness + totalTaxes;

        totalRentalCost = "El costo total de renta por el vehículo " + vehicleType + " es de: " + "$" + total;
        return totalRentalCost;
    }

    /**Descripcion de la funcion
     * Calcula en base a el performance, distancia y precio de gasolina el costo por los litros consumidos
     * @param distance --> Es la distancia a recorrer en el vehículo rentado
     * @param gasPrice --> Precio de la gasolina(puede variar)
     * @param vehiclePerformance --> Rendidmiento en kilometros por litro de gasolina
     * @return expenseGasolinePrice --> Gasto total por la gasolina a utilizar
     * */
    private double calculateGasCost(double distance, double gasPrice, double vehiclePerformance){
        double usedLitres = distance/vehiclePerformance;
        double expenseGasolinePrice = usedLitres * gasPrice;

        return expenseGasolinePrice;
    }

    /**Descripcion de la funcion
     * Calcula en base al costo de la gasolina el peaje que se debe de pagar
     * @param gasolineUsed --> Es el costo de la gasolina a utilizar en el viaje
     * @param tip --> Es el porcentaje con respecto a la gasolina que se cobra de peaje
     * @return totalTip --> Gasto total por peaje del viaje
     * */
    private double calculateTipCost(double gasolineUsed, double tip){
        double totalTip = gasolineUsed * tip;
        return totalTip;
    }

    /**Descripcion de la funcion
     * Calcula en base al costo de la gasolina el porcentaje que se queda el negocio
     * @param gasolineUsed --> Es el costo de la gasolina a utilizar en el viaje
     * @param business --> Es el porcentaje con respecto a la gasolina que se queda para el negocio
     * @return totalBusiness --> Gasto total pora el negocio
     * */
    private double calculateBusinessCost(double gasolineUsed, double business){
        double totalBusiness = gasolineUsed * business;
        return totalBusiness;
    }

    /**Descripcion de la funcion
     * Calcula en base al costo de la gasolina el porcentaje que se paga de impuestos
     * @param gasolineUsed --> Es el costo de la gasolina a utilizar en el viaje
     * @param taxes --> Es el porcentaje con respecto a la gasolina que se paga por impuestos
     * @return totalTaxes --> Gasto total por impuestos
     * */
    private double calculateTaxesCost(double gasolineUsed, double taxes){
        double totalTaxes = gasolineUsed * taxes;
        return totalTaxes;
    }


}
