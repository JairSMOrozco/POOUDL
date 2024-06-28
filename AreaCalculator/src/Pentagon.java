public class Pentagon {
    //Atributos
    public double side;
    public double apothem;

    //Métodos
    public double calculatePentagonArea(){
        double pentagonArea;

        pentagonArea = (calculateCirclePerimeter() * apothem) / 2;

        return pentagonArea;
    }

    public double calculateCirclePerimeter(){
        double pentagonPerimeter;

        pentagonPerimeter = side * 5;

        return pentagonPerimeter;
    }
}
