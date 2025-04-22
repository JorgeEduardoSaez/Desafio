package com.baseproject.dto;

import java.util.List;

public class UsuariosResponse {

    private Integer edad;
    List<UsuarioResponse> usuarios;


    public UsuariosResponse(Integer edad, List<UsuarioResponse> usuarios) {
        this.edad = edad;
        this.usuarios = usuarios;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public List<UsuarioResponse> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioResponse> usuarios) {
        this.usuarios = usuarios;
    }
}