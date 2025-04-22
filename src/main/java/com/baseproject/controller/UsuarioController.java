package com.baseproject.controller;

import com.baseproject.dto.UsuariosResponse;
import com.baseproject.service.impl.Agrupados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UsuarioController {
    private final Agrupados agrupar;

    UsuarioController(Agrupados agrupar){
        this.agrupar = agrupar;

    }


    @GetMapping("/edad")
    public List <UsuariosResponse> getAgrupadosPorEdad(){
        List<UsuariosResponse> usuarios = agrupar.getAgrupadosPorEdad();
        return usuarios;

    }

    @GetMapping("/ordenados")
    public List <UsuariosResponse> getAgruparPorEdadyOrdenados(){
        List <UsuariosResponse> usuarios = agrupar.getAgrupadosPorEdadyOrdenados();
        return usuarios;
    }




}
