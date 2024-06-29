public class Pentagon {
    //Atributos
    public double side;
    public double apothem;

    //Métodos
    /**Descripción de la función
     * Calcula el área del pentágono tomando de los atributos los valores necesarios
     * @return pentagonArea --> Es el resultado del cálculo del área
     * */
    public double calculatePentagonArea(){
        double pentagonArea;

        pentagonArea = (calculateCirclePerimeter() * apothem) / 2;

        return pentagonArea;
    }

    /**Descripción de la función
     * Calcula el perímetro del pentágono tomando de los atributos los valores necesarios
     * @return pentagonPerimeter --> Es el resultado del cálculo del perímetro
     * */
    public double calculateCirclePerimeter(){
        double pentagonPerimeter;

        pentagonPerimeter = side * 5;

        return pentagonPerimeter;
    }
}
