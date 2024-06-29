public class NumberComparison {

    public static void main(String[] args) {
        //Variables del método
        int[] numbers = new int[3];
        boolean areRepeat = true;
        int[] comparisonResult = new int[3];

        //Instancias de las clases
        DataInput capture = new DataInput();
        Validation validation = new Validation();
        Comparison orderedNumbers = new Comparison();
        Output result = new Output();

        do{
            //La variable(array) numbers tiene los valores capturados del usuario
            numbers = capture.getNumbers();

            //Validacion de los datos. Si hay un valor repetido areRepeat es false
            areRepeat = validation.validateData(numbers);

        }while(areRepeat);

        //Ordenar los datos en el arreglo de manera ascendente
        comparisonResult = orderedNumbers.compereNumbers(numbers);

        //Salida de resultados
        result.output(comparisonResult);

    }

}