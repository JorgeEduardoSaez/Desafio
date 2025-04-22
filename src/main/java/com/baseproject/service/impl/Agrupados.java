package com.baseproject.service.impl;

import com.baseproject.dto.UsuariosResponse;

import java.util.List;

public interface Agrupados
{
    List<UsuariosResponse> getAgrupadosPorEdad();
    List <UsuariosResponse> getAgrupadosPorEdadyOrdenados();
}
