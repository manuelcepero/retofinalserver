/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nttdata.retofinalserver.usuario;

/**
 *
 * @author Manuel
 */
public class UsuarioBuilder {

    private int id;
    private String nombre;

    public UsuarioBuilder() {
    }

    public UsuarioBuilder id(int id) {
        this.id=id;
        return this;
    }
    
    public UsuarioBuilder nombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    public Usuario build() {
        Usuario usuario = new Usuario();
        usuario.setNombre(this.nombre);
        return usuario;

    }
}
