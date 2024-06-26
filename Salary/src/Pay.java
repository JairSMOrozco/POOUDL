public class Pay {
    //Métodos
    /**Descripción de la función: Muestra en consola el resultado de los cálculos de salario
     * @param workData --> Son los datos ingresados por el usuario(horas trabajadas y tarifa de pago)
     * @param salary --> Es el resultado de los cálculos hechos en los métodos de la clase CalculatorSalary
     * */
    public void showSalary(double[] workData, double salary){
        System.out.println("Horas trabajadas: " + workData[0]);
        System.out.println("Tarifa de pago por hora: " + workData[1]);
        System.out.println("El salario del colaborador contando horas extra es de: $" + salary);
    }
}
