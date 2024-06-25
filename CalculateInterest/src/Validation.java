public class Validation {
    //Atributos
    private boolean isValidate;

    //Métodos
    public boolean validateData(double[] interestData){

        if(interestData[0] <= 0){
            System.out.println("El capital no puede ser menor o igual a cero");
            isValidate = false;

        } else if (interestData[1] <= 0) {
            System.out.println("El interés debe de ser mayor que 0");
            isValidate = false;

        } else if (interestData[2] <= 0) {
            System.out.println("El periodo de tiempo debe de ser mínimo de 1 día");
            isValidate = false;

        }else {
            isValidate = true;
        }

        return isValidate;
    }
}
