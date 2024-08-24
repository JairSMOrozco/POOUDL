class passwordsOlvidados extends passwords {

    public void PedirUsername(String usuario) {

        if (usuario.equals(usuario.toUpperCase())) {
            //Aquí aplica la HERENCIA, hay que llamar al método generarPass para crear la nueva contraseña
            //La contraseña se guarda en el atributo pass de passwords
        } else {
            System.out.println("El nombre de usuario no es correcto.");
        }
    }

    public void aviso_Usuario(String nuevoPass) {
        //Te recomiendo mandar llamar aquí la contraseña almacenda en el atributo pass
        //de la clase passwords. Invócalo con super.getPass();
        System.out.println("Nuevo password generado: ");
    }
}