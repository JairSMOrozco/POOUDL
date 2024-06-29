public class CalculatorSalary {
    //Atributos
    private double salary;
    private double howManyExtraHours;

    //Métodos
    /**Descripción de la función: Llama a los métodos responsables para calcular horas extra y salario total
     * @param workData --> Son los datos ingresados por el usuario (horas trabajadas y tarifa de pago)
     * @see #extraHours(double)
     * @see #calculateSalary(double, double, double)
     * @return salary --> Es la variable que contiene el salario final del colaborador
     * */
    public double pay(double[] workData){
        extraHours(workData[0]);
        calculateSalary(workData[0], workData[1], howManyExtraHours);

        return salary;
    }

    /** Descripción de la función: Recibe el total de horas trabajadas y le resta 40 para ver si hay horas extra
     * @param hours --> Son el total de horas trabajadas
     * */
    private void extraHours(double hours){
        double subtractionHours = hours - 40;

        if(subtractionHours > 0){
            howManyExtraHours = subtractionHours;
        }else {
            howManyExtraHours = 0;
        }

    }

    /**Descripción de la función: Calcula el salario final tomando en cuentas horas trabajadas, tarifa por hora y horas extra
     * @param hours --> Horas trabajadas en total
     * @param fee --> Tarifa por hora trabajada
     * @param extraHours --> Total de horas extra. Salen del método #extraHours(double hours)
     */
    private void calculateSalary(double hours, double fee, double extraHours){
        double amountHoursPaidDouble = (fee * 2) * extraHours;
        double total = ((hours - extraHours) * fee) + amountHoursPaidDouble;

        salary = total;
    }

}
