public class Pay {

    //Métodos
    public void output(double[] results){
        System.out.println("Monto total a pagar por mes: $" + Math.round(results[0] * 100.0) / 100.0);
        System.out.println("Total a pagar en el plazo indicado: $" + Math.round(results[1] * 100.0) / 100.0);
    }
}
