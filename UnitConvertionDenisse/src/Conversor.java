public class Conversor {
    private double valor;

    // Constructor sin parámetros
    public Conversor() {
        this.valor = 0.0;
    }

    // Constructor con parámetro
    public Conversor(double valor) {
        this.valor = valor;
    }

    // Método setter para asignar el valor
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método getter para obtener el valor
    public double getValor() {
        return valor;
    }

    // Método para convertir libras a kilogramos
    public double librasAKilogramos() {
        return convertir(valor, 0.45359237);
    }

    // Sobrecarga del método para convertir libras a kilogramos con parámetro
    public double librasAKilogramos(double valor) {
        return convertir(valor, 0.45359237);
    }

    // Método para convertir millas a kilómetros
    public double millasAKilometros() {
        return convertir(valor, 1.60934);
    }

    // Sobrecarga del método para convertir millas a kilómetros con parámetro
    public double millasAKilometros(double valor) {
        return convertir(valor, 1.60934);
    }

    // Método para convertir galones a litros
    public double galonesALitros() {
        return convertir(valor, 3.78541);
    }

    // Sobrecarga del método para convertir galones a litros con parámetro
    public double galonesALitros(double valor) {
        return convertir(valor, 3.78541);
    }

    // Método para convertir Fahrenheit a Celsius
    public double fahrenheitACelsius() {
        return (valor - 32) * 5 / 9;
    }

    // Sobrecarga del método para convertir Fahrenheit a Celsius con parámetro
    public double fahrenheitACelsius(double valor) {
        return (valor - 32) * 5 / 9;
    }

    // Método para validar que el valor no sea negativo
    public boolean validarValor() {
        return valor >= 0;
    }

    // Método privado para realizar la conversión
    private double convertir(double valor, double factor) {
        return valor * factor;
    }
}
