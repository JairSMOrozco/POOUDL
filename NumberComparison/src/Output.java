public class Output {

    //Métodos
    public void output(int[] arrayNumbers){
        int mNumber = arrayNumbers[0];
        int hNumber = arrayNumbers[arrayNumbers.length - 1];

        System.out.println("El número menor es " + mNumber);
        System.out.println("El número mayor es " + hNumber);
    }

}