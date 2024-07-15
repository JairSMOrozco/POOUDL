public class Calculos {
    //Atributos
    int base;
    int potencia;

    public Calculos(){
        this.base = 1;
        this.potencia = 1;
    }

    //Métodos
    //1 método para elevar BASE a la POTENCIA
    public double potenciax(int base, int potencia){
        double resultado = Math.pow(base, potencia);
        return resultado;
    }

    //1 método para elevar un número entero al cuadrado
    public double potenciax(int base){
        double resultado = Math.pow(base, 2);
        return resultado;
    }

    //1 método para elevar un número flotante al cuadrado
    public double potenciax(double base){
        double resultado = Math.pow(base, 2);
        return resultado;
    }

    //1 método para devolver o en caso de no recibir parámetros
    public double potenciax(){
        double resultado = Math.pow(this.base, this.potencia);

        return resultado;
    }


}
