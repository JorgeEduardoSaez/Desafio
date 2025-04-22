package com.baseproject.dto;


public class UsuarioResponse {

    private Usuario usuarioResponse;

    public UsuarioResponse(Usuario usuarioResponse) {
        this.usuarioResponse = usuarioResponse;
    }

    public Usuario getUsuarioResponse() {
        return usuarioResponse;
    }

    public void setUsuarioResponse(Usuario usuarioResponse) {
        this.usuarioResponse = usuarioResponse;
    }
}
