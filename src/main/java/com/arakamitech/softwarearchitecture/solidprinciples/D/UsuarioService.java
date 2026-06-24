package com.arakamitech.softwarearchitecture.solidprinciples.D;

public class UsuarioService {

    private final UsuarioInterface usuarioInterface;

    public UsuarioService(UsuarioInterface usuarioInterface) {
        this.usuarioInterface = usuarioInterface;
    }

    public void guardarUsuarioOracle() {
        usuarioInterface.guardar();
    }
    
    public void guardarUsuarioMysql() {
        usuarioInterface.guardar();
    }

}
