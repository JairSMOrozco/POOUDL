public class Validation {

    //Métodos
    public boolean validateData(int[] arrayNumbers){
        int i;
        int j;

        for(i = 0; i < arrayNumbers.length; i++){
            for (j = i + 1; j < arrayNumbers.length; j++){
                if (arrayNumbers[i] == arrayNumbers[j]){
                    //Si hay números repetidos el retorno es true
                    System.out.println("Hay un número repetido, vuelve a intentar");
                    return true;
                }
            }
        }

        return false;
    }
}
