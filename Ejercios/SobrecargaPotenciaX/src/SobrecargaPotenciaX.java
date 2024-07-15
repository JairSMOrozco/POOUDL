public class SobrecargaPotenciaX {
    public static void main(String[] args) {
        Calculos potencia = new Calculos();

        double resultado1 = potencia.potenciax(5,3);
        double resultado2 = potencia.potenciax(10);
        double resultado3 = potencia.potenciax(2.3);
        double resultado4 = potencia.potenciax();

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);


    }
}