public class Result {
    //Métodos
    public void showResultArea(char selectedFigure, double result){
        switch (selectedFigure){
            case 'a':
                rectangleAreaResult(result);
                break;
            case 'b':
                circleAreaResult(result);
                break;
            case 'c':
                pentagonAreaResult(result);
                break;
        }
    }

    private void rectangleAreaResult(double result){
        System.out.println("El área del rectángulo es de " + result + " cm2");
    }

    private void circleAreaResult(double result){
        System.out.println("El área del círculo es de " + result + " cm2");
    }

    private void pentagonAreaResult(double result){
        System.out.println("El área del pentágono es de " + result + " cm2");
    }

}
