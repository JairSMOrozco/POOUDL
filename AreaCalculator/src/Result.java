public class Result {
    //Métodos
    /**Descripcón de la función
     * Muestra en consola el resultado del cálculo del área de la figura seleccionada.
     * La respuesta se adapta a la figura elegida por lo que necesita recibir la figura seleccionada.
     * @param selectedFigure --> Es la figura seleccionada por usuario desde le menú principal
     * @param result --> Es el cálculo hecho por el respectivo objeto al que la figura pertenece
     * */
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

    /**Descripcón de la función
     * Imprime el resultado del área del rectángulo
     * @param result --> Es el cálculo hecho por el respectivo objeto al que la figura pertenece
     * */
    private void rectangleAreaResult(double result){
        System.out.println("El área del rectángulo es de " + result + " cm2");
    }

    /**Descripcón de la función
     * Imprime el resultado del área del círculo
     * @param result --> Es el cálculo hecho por el respectivo objeto al que la figura pertenece
     * */
    private void circleAreaResult(double result){
        System.out.println("El área del círculo es de " + result + " cm2");
    }

    /**Descripcón de la función
     * Imprime el resultado del área del pentágono
     * @param result --> Es el cálculo hecho por el respectivo objeto al que la figura pertenece
     * */
    private void pentagonAreaResult(double result){
        System.out.println("El área del pentágono es de " + result + " cm2");
    }

}
