package com.arakamitech.softwarearchitecture.solidprinciples.S;

public class EmailService {

    public void enviarCorreo(UsuarioEntity usuario) {
        System.out.println("Envia un correo electronico al usuario: " + usuario);
    }
}
