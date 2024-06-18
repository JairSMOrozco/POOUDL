public class Bisiestos {

    public static void main(String[] args) {

        int year;
        boolean yearValue;

        //Instancias
        Captura yearCapture = new Captura();
        Validacion validationYear = new Validacion();
        Determinacion isBiDetermination = new Determinacion();
        MuestraSalida result = new MuestraSalida();

        year = yearCapture.pedirDato();

        if(validationYear.validationData(year) == true){
            System.out.println("Año dentro de rango, procediendo a determinación de bisiesto");
            yearValue = isBiDetermination.calculateBi(year);

            result.showResult(yearValue);

        }else{
            System.out.println("Error, dato fuera de rango");
        }


    }
}