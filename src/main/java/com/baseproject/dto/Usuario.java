package com.baseproject.dto;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int age;
    private String name;

    public Usuario(final int age, final String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void printPersons(final List<Usuario> personList) {
        System.out.println(personList);
    }


    public static void main(final String[] args) {
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
        Usuario.printPersons(listUsuarios);
    }
}
