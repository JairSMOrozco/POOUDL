public class Rectangle {
    //Atributos
    public double base;
    public double height;

    //Métodos
    /**Descripción de la función
     * Calcula el área del rectángulo tomando de los atributos los valores necesarios
     * @return rectangleArea --> Es el resultado del cálculo del área
     * */
    public double calculateRectangleArea(){
        double rectangleArea;

        rectangleArea = base * height;

        return rectangleArea;
    }
}
