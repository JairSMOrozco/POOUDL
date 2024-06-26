public class Salary {
    public static void main(String[] args) {
        //variables del método main
        double[] workData = new double[2];
        boolean isDataCorrect = false;
        double salary;

        //Instancias de clases
        Data captureData = new Data();
        Verification dataVerificaction = new Verification();
        CalculatorSalary employeeSalary = new CalculatorSalary();
        Pay pay = new Pay();

        do {
            //Almacenando la información del usuario en un Array de 2 posiciones
            workData = captureData.getWorkData();

            //Mandando array de datos a verificar
            isDataCorrect = dataVerificaction.workDataValidation(workData);

        }while(isDataCorrect == false);

        //Se alamacena el salario total del colaborador despuésde hacer los cálculos de tarifa por horas
        salary = employeeSalary.pay(workData);

        //Método de la clase Pay que muestra en consola el resultado del salario
        pay.showSalary(workData, salary);


    }
}