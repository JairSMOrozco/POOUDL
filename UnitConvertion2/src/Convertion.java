public class Convertion {
    //Atributos
    private double value;
    private double result;
    private boolean isValueCorrect;


    //Métodos
    Convertion(){
        this.value = 1;
        this.result = 0;
    };

    private void validation(double value){
        if (value < 0){
            isValueCorrect = false;
            //throw new IllegalArgumentException("Cantidad no válida");
        }else {
            isValueCorrect = true;
        }
    }

    //Setters
    /**Da el valor al atributo value
     * @param value --> Libras ingresadas por usuario para convertir
     * */
    private void setValue(double value){
        this.value = value;
    }

    //Getters
    /**Obtiene el valor del atributo result
     * @return result: Devuelve el resultado de la conversión
     */
    public double getValue(){
        return result;
    }

    //Cálculos
    /**Convierte el valor de las libras suministradas a kilogramos usando el valor del atributo value
     * */
    public void convertToKilograms(){
        double poundToKiloValue = 0.454;
        this.result = value * poundToKiloValue;
    }

    public boolean convertToKilograms(double pounds){
        double poundToKiloValue = 0.454;

        validation(pounds);

        if(!isValueCorrect){
            System.out.println("No se pueden realizar cálculos con una cifra menor a cero");
        }else{
            setValue(pounds);
            this.result = value * poundToKiloValue;
        }
        return isValueCorrect;
    }

    /**Convierte el valor de las millas suministradas a kilometros usando el valor del atributo value
     * */
    public void convertToKilometers(){
        double mileToKilometerValue = 1.609;
        this.result = value * mileToKilometerValue;
    }

    public boolean convertToKilometers(double miles){
        double mileToKilometerValue = 1.609;

        validation(miles);

        if(!isValueCorrect){
            System.out.println("No se pueden realizar cálculos con una cifra menor a cero");
        }else{
            setValue(miles);
            this.result = value * mileToKilometerValue;
        }
        return isValueCorrect;
    }

    /**Convierte el valor de los galones suministrados a litros usando el valor del atributo value
     * */
    public void convertToLiters(){
        double gallonToLiterValue = 3.785;
        this.result = value * gallonToLiterValue;
    }

    public boolean convertToLiters(double galons){
        double gallonToLiterValue = 3.785;

        validation(galons);

        if(!isValueCorrect){
            System.out.println("No se pueden realizar cálculos con una cifra menor a cero");
        }else{
            setValue(galons);
            this.result = value * gallonToLiterValue;
        }
        return isValueCorrect;
    }

    /**Convierte el valor de los grados fahrenheit suministrados a centigrados usando el valor del atributo value
     * */
    public void convertToCelsius(){
        this.result = (value - 32) / 1.8;
    }

    public boolean convertToCelsius(double fahrenheit){

        validation(fahrenheit);

        if(!isValueCorrect){
            System.out.println("No se pueden realizar cálculos con una cifra menor a cero");
        }else{
            setValue(fahrenheit);
            this.result = (value - 32) / 1.8 ;
        }
        return isValueCorrect;
    }


}
