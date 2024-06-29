public class PrintSeason {
    //Métodos

    /**Descripción de la función
     * Imprime en consola a que estación del año pertenecen los datos ingresados
     * */
    public void printSeason(String season, int[] date){
        System.out.println("La fecha " + date[0]+ "/" + date[1] + "/" + date[2] + " se encuentra en la estación " + season);
    }
}
