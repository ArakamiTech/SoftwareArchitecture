package com.arakamitech.softwarearchitecture.solidprinciples.S;

public class UsuarioEntity {
    private Long id;
    private String numeroIdentificacion;

    public Long getId() {
        return id;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    
    
}
