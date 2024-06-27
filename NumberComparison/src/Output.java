public class Output {

    //Métodos
    /**Descripción de la función
     * Muestra en consola el número menor y el mayor que contiene el array
     * @param arrayNumbers --> Lista de números capturados por el usuario y ordenado
     * */
    public void output(int[] arrayNumbers){
        //Variables que almacenan el primer y último elemento del array
        int mNumber = arrayNumbers[0];
        int hNumber = arrayNumbers[arrayNumbers.length - 1];

        //Salida en consola de los resultados
        System.out.println("El número menor es " + mNumber);
        System.out.println("El número mayor es " + hNumber);
    }

}
