public class AreaCalculator {

    public static void main(String[] args) {
        //Atributos
        char selectedFigure;
        boolean isFigureOptionCorrect;
        double rectangleArea;
        double circleArea;
        double pentagonArea;

        //Instancias de clase
        Menu menu = new Menu();
        Data captureData = new Data();
        Verification verificationData = new Verification();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Pentagon pentagon = new Pentagon();
        Result result = new Result();

        while (true){

            do {

                menu.showMenu();
                selectedFigure = captureData.getFigure();

                isFigureOptionCorrect = verificationData.verifyOptionArea(selectedFigure);

            }while(!isFigureOptionCorrect);

            switch (selectedFigure){
                case 'a':
                    rectangle.base = captureData.getRectangleBase();
                    rectangle.height = captureData.getRectangleHeight();
                    rectangleArea = rectangle.calculateRectangleArea();
                    result.showResultArea(selectedFigure, rectangleArea);
                    break;
                case 'b':
                    circle.radio = captureData.getCircleRadio();
                    circleArea = circle.calculateCircleArea();
                    result.showResultArea(selectedFigure, circleArea);
                    break;
                case 'c':
                    pentagon.side = captureData.getPentagonSide();
                    pentagon.apothem = captureData.getPentagonApothem();
                    pentagonArea = pentagon.calculatePentagonArea();
                    result.showResultArea(selectedFigure, pentagonArea);
                    break;
                case 'd':
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
            }

        }

    }
}