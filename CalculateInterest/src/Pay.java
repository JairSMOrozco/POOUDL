public class Pay {

    //Métodos
    /**Descripción de la función
     * Muestra en pantalla resultados de calculo de intereses en un peridodo de tiempo dado
     * @param results --> Array con dos valores que son el total a pagar por mes y el total de capital generado en el plazo de tiempo dado
     * */
    public void output(double[] results){
        System.out.println("Monto total a pagar por mes: $" + Math.round(results[0] * 100.0) / 100.0);
        System.out.println("Total a pagar en el plazo indicado: $" + Math.round(results[1] * 100.0) / 100.0);
    }
}
