package com.baseproject.service.impl;

import com.baseproject.dto.Usuario;
import com.baseproject.dto.UsuarioResponse;
import com.baseproject.dto.UsuariosResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgruparUsuarios implements Agrupados {
    @Override
    public List <UsuariosResponse> getAgrupadosPorEdad() {

        List<Usuario> listUsuarios = data();

        List<Integer> listaEdad = new ArrayList<>();

        List <UsuariosResponse> usuariosResponses = new ArrayList<>();
        List <UsuarioResponse> response;

        for (Usuario usuario : listUsuarios) { // lista de edades
            listaEdad.add(usuario.getAge());
        }

        // Eliminamos las edades repetidas
        listaEdad = listaEdad.stream().distinct().collect(Collectors.toList());

        Collections.sort(listaEdad);

        //Obtenemos la lista de usuarios ordenados por edad
        for (Integer edad : listaEdad){
            response = listUsuarios.stream()
                    .filter(e -> e.getAge() == edad)
                    .map(UsuarioResponse::new)
                    .collect(Collectors.toList());

            UsuariosResponse collect = new UsuariosResponse(edad,response);

            usuariosResponses.add(collect);
        }

        return usuariosResponses;
    }

    @Override
    public List <UsuariosResponse> getAgrupadosPorEdadyOrdenados() {

        List<Usuario> listUsuarios = data();

        List<Integer> listaEdad = new ArrayList<>();

        List <UsuariosResponse> usuariosResponses = new ArrayList<>();
        List <UsuarioResponse> response;

        for (Usuario usuario : listUsuarios) { // lista de edades
            listaEdad.add(usuario.getAge());
        }

        // Eliminamos las edades repetidas
        listaEdad = listaEdad.stream().distinct().collect(Collectors.toList());

        Collections.sort(listaEdad);

        //Obtenemos la lista de usuarios ordenados por edad
        for (Integer edad : listaEdad){
            response = listUsuarios.stream()
                    .filter(e -> e.getAge() == edad)
                    .sorted(Comparator.comparing(Usuario::getName)) // ordenamos la lista alfabeticamente
                    .map(UsuarioResponse::new)
                    .collect(Collectors.toList());

            UsuariosResponse collect = new UsuariosResponse(edad,response);
            usuariosResponses.add(collect);
        }

        return usuariosResponses;
    }

    public List<Usuario> data(){
        final List<Usuario> listUsuarios = new ArrayList<>();
        listUsuarios.add(new Usuario(37, "Claudio Bravo"));
        listUsuarios.add(new Usuario(36, "Jean Beausejour"));
        listUsuarios.add(new Usuario(34, "Gonzalo Jara"));
        listUsuarios.add(new Usuario(33, "Gary Medel"));
        listUsuarios.add(new Usuario(32, "Mauricio Isla"));
        listUsuarios.add(new Usuario(31, "Charles Aránguiz"));
        listUsuarios.add(new Usuario(33, "Arturo Vidal"));
        listUsuarios.add(new Usuario(34, "Matias Fernandez"));
        listUsuarios.add(new Usuario(36, "Jorge Valdivia"));
        listUsuarios.add(new Usuario(31, "Alexis Sánchez"));
        listUsuarios.add(new Usuario(30, "Eduardo Vargas"));
        return listUsuarios;
    }
}
