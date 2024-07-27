public class Convertion {
    //Atributos
    private double numberValue;
    private double result;


    //Métodos
    Convertion(){
        this.numberValue = 1;
        this.result = 0;
    };

    private void validation(double value){
        try{
            if (value <= 0){
                throw new IllegalArgumentException("Cantidad no válida, no se pueden realizar cálculos con una cifra menor o igual a cero");
            }
        }catch(IllegalArgumentException e){
            System.out.println("Cantidad no válida, no se pueden realizar cálculos con una cifra menor o igual a cero");
        }

    }

    //Setters
    /**Da el valor al atributo numberValue para luego realizar el cálculo
     * @param pounds --> Libras ingresadas por usuario para convertir
     * */
    public void setPoundsValue(double pounds){
        validation(pounds);
        this.numberValue = pounds;
    }

    //Getters
    public double getKilogramsValue(){
        return result;
    }

    //Cálculos
    /**Convierte el valor de las libras suministradas a kilogramos usando el valor del atributo numberValue
     * */
    public void convertToKilograms(){
        double poundToKiloValue = 0.454;
        this.result = numberValue * poundToKiloValue;
    }
    public void convertToKilograms(double pounds){
        double poundToKiloValue = 0.454;
        setPoundsValue(pounds);
        this.result = numberValue * poundToKiloValue;
    }


}
