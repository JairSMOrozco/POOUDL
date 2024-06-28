public class Circle {
    //Atributos
    public double radio;
    public double PI = 3.1416;

    //Métodos
    public double calculateCircleArea(){
        double circleArea;

        circleArea = (PI) * Math.pow(radio,2);

        return circleArea;
    }
}
