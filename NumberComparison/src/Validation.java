public class Validation {

    //Métodos
    /**Descripción de la función
     * Recorre un array y los va comparando para asegurarse que no se repitan
     * @param arrayNumbers --> Lista de números capturados por el usuario
     * @return true or false --> Si hay números repetidos es true si no es false
     * */
    public boolean validateData(int[] arrayNumbers){
        int i;
        int j;

        //ciclo for que toma posición por posición del array y los va comparando con el resto de posiciones una por una
        for(i = 0; i < arrayNumbers.length; i++){
            for (j = i + 1; j < arrayNumbers.length; j++){
                if (arrayNumbers[i] == arrayNumbers[j]){
                    //Si hay números repetidos el retorno es true
                    System.out.println("Hay un número repetido, vuelve a intentar");
                    return true;
                }
            }
        }
        //Si no hay números repetidos el retorno es false
        return false;
    }
}
