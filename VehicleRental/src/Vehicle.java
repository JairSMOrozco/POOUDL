public class Vehicle {
    //Atributos
    private String totalRentalCost;
    public String vehicleType;
    public double vehiclePerformance;
    public double defaultTip = .5;
    public double defaultBusiness = .3;
    public double defaultTaxes = .05;

    //Métodos
    public String getTotalRentalCost(double distance, double gasPrice){
        double gasoline = calculateGasCost(distance, gasPrice, vehiclePerformance);
        double totalTip = calculateTipCost(gasoline, defaultTip);
        double totalBusiness = calculateBusinessCost(gasoline, defaultBusiness);
        double totalTaxes = calculateTaxesCost(gasoline, defaultTaxes);

        double total = gasoline + totalTip + totalBusiness + totalTaxes;

        totalRentalCost = "El costo total de renta por el vehículo " + vehicleType + " es de: " + "$" + total;
        return totalRentalCost;
    }


    private double calculateGasCost(double distance, double gasPrice, double vehiclePerformance){
        double usedLitres = distance/vehiclePerformance;
        double expenseGasolinePrice = usedLitres * gasPrice;

        return expenseGasolinePrice;
    }

    private double calculateTipCost(double gasolineUsed, double tip){
        double totalTip = gasolineUsed * tip;
        return totalTip;
    }

    private double calculateBusinessCost(double gasolineUsed, double business){
        double totalBusiness = gasolineUsed * business;
        return totalBusiness;
    }

    private double calculateTaxesCost(double gasolineUsed, double taxes){
        double totalTaxes = gasolineUsed * taxes;
        return totalTaxes;
    }


}
