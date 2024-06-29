import java.util.Scanner;

public class Data {

    //Métodos

    /**Descripción de la función
     * Pide a usuario ingresar una opción del menú
     * @return selectedFigure --> Es la opción ingresada por usuario
     * */
    public char getFigure(){
        Scanner readFigure = new Scanner(System.in);

        char selectedFigure = readFigure.next().charAt(0);

        return selectedFigure;
    }


    //Base del rectángulo
    /**Descripción de la función
     * Pide a usuario ingresar la medida de la base del rectángulo.
     * Tiene una verificación para saber que el valor ingresado no puede ser 0 o menos
     * @return base --> Es el valor que tomará la base del rectángulo
     * */
    public double getRectangleBase(){
        double base;
        boolean isRectangleBaseCorrect;
        Scanner rectangleBase = new Scanner(System.in);

        do {
            System.out.println("Ingresa el valor de la base en cm");
            base = rectangleBase.nextDouble();

            if (base <= 0){
                System.out.println("Valor de la base no válido");
                System.out.println("Intenta de nuevo");
                isRectangleBaseCorrect = false;
            }else {
                isRectangleBaseCorrect = true;
            }
        }while (!isRectangleBaseCorrect);

        return base;
    }

    //Altura del rectángulo
    /**Descripción de la función
     * Pide a usuario ingresar la medida de la altura del rectángulo.
     * Tiene una verificación para saber que el valor ingresado no puede ser 0 o menos
     * @return height --> Es el valor que tomará la altura del rectángulo
     * */
    public double getRectangleHeight(){
        double height;
        boolean isRectangleHeightCorrect;
        Scanner rectangleHeight = new Scanner(System.in);

        do {
            System.out.println("Ingresa el valor de la altura en cm");
            height = rectangleHeight.nextDouble();

            if (height <= 0){
                System.out.println("Valor de la altura no válido");
                System.out.println("Intenta de nuevo");
                isRectangleHeightCorrect = false;
            }else {
                isRectangleHeightCorrect = true;
            }

        }while(!isRectangleHeightCorrect);


        return height;
    }

    //Radio del círculo
    /**Descripción de la función
     * Pide a usuario ingresar la medida del radio del círculo.
     * Tiene una verificación para saber que el valor ingresado no puede ser 0 o menos
     * @return radio --> Es el valor que tomará el radio del círculo
     * */
    public double getCircleRadio(){
        double radio;
        boolean isCircleRadioCorrect;
        Scanner circleRadio = new Scanner(System.in);

        do {
            System.out.println("Ingresa el radio del círculo en cm");
            radio = circleRadio.nextDouble();

            if (radio <= 0){
                System.out.println("Valor del radio no válido");
                System.out.println("Intenta de nuevo");
                isCircleRadioCorrect = false;

            }else {
                isCircleRadioCorrect = true;
            }

        }while(!isCircleRadioCorrect);

        return radio;
    }

    //Lado del pentágono
    /**Descripción de la función
     * Pide a usuario ingresar la medida del lado del pentágono.
     * Tiene una verificación para saber que el valor ingresado no puede ser 0 o menos
     * @return side --> Es el valor que tomará el lado del pentágono
     * */
    public double getPentagonSide(){
        double side;
        boolean isPentagonSideCorrect;
        Scanner pentagonSide = new Scanner(System.in);

        do {
            System.out.println("Ingresa el valor del lado del pentágono en cm");
            side = pentagonSide.nextDouble();

            if (side <= 0){
                System.out.println("Valor del lado no válido");
                System.out.println("Intenta de nuevo");
                isPentagonSideCorrect = false;

            }else {
                isPentagonSideCorrect = true;
            }

        }while(!isPentagonSideCorrect);

        return side;
    }

    //Apotema del pentágono
    /**Descripción de la función
     * Pide a usuario ingresar la medida del apotema  del pentágono.
     * Tiene una verificación para saber que el valor ingresado no puede ser 0 o menos
     * @return apothem --> Es el valor que tomará el apotema del pentágono
     * */
    public double getPentagonApothem(){
        double apothem;
        boolean isPentagonApothemCorrect;
        Scanner pentagonApothem = new Scanner(System.in);

        do {
            System.out.println("Ingresa el valor del apotema del pentágono en cm");
            apothem = pentagonApothem.nextDouble();

            if (apothem <= 0){
                System.out.println("Valor del apotema no válido");
                System.out.println("Intenta de nuevo");
                isPentagonApothemCorrect = false;

            }else {
                isPentagonApothemCorrect = true;
            }

        }while(!isPentagonApothemCorrect);

        return apothem;
    }
}
