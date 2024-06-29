public class Circle {
    //Atributos
    public double radio;
    public double PI = 3.1416;

    //Métodos
    /**Descripción de la función
     * Calcula el área del círculo tomando de los atributos los valores necesarios
     * @return circleArea --> Es el resultado del cálculo del área
     * */
    public double calculateCircleArea(){
        double circleArea;

        circleArea = (PI) * Math.pow(radio,2);

        return circleArea;
    }
}
