import java.util.Arrays;

public class Comparison {
    //Atributos
    private int[] orderedNumbers = new int[3];

    //Métodos

    /**Descripción de la función
     * Ordena de menor a mayor el arreglo ya validado y lo devuelve.
     * @param arrayNumbers --> Es la lista de números que capturó el usuario
     * @return orderedNumbers --> Lista de números ordenada
     * */
    public int[] compereNumbers(int[] arrayNumbers){
        //Método sort ordena el contenido de un array de forma descendente
        Arrays.sort(arrayNumbers);

        //Array de números ya ordenado
        orderedNumbers = arrayNumbers;

        return orderedNumbers;
    }

}
