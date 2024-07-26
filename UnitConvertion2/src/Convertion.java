public class Convertion {
    //Atributos
    double numberValue;
    double result;
    double poundToKiloValue = 0.454;
    double mileToKilometerValue = 1.609;
    double gallonToLiterValue = 3.785;


    //Métodos
    Convertion(){
        this.numberValue = 1;
        this.result = 0;
    };

    //Setters
    /**Da el valor al atributo numberValue para luego realizar el cálculo
     * @param pounds --> Libras ingresadas por usuario para convertir
     * */
    public void setPoundsValue(double pounds){
        if (pounds <= 0){
            System.out.println("Cantidad no válida");
            System.out.println("No se pueden realizar cálculos con una cifra menor o igual a cero");
        }else {
            this.numberValue = pounds;
        }
    }

    //Getters
    public double getKilogramsValue(){
        return this.result;
    }

    //Cálculos
    /**Convierte el valor de las libras suministradas a kilogramos usando el valor del atributo numberValue
     * */
    public void convertToKilograms(){
        this.result = numberValue * poundToKiloValue;
    }
    public void convertToKilograms(double pounds){
        setPoundsValue(pounds);
        this.result = numberValue * poundToKiloValue;
    }


}
