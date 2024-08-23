public class PasswordsOlvidados extends Passwords{
    //Atributos

    //Métodos
    public void askUserName(String user){

        boolean isUpper  = user.equals(user.toUpperCase());

        if(user.length() == 8 && isUpper){
            super.generatePassword();
            userMessage();
        }else {
            System.out.println("Nombre de usuario no válido");
            System.out.println("El nombre debe tener 8 caracteres y estar en mayúsculas");
        }
    }

    private void userMessage(){
        System.out.println("Contraseña restablecida \n" +
                           "Su nueva contraseña es: " + super.getPassword());
    }
}
