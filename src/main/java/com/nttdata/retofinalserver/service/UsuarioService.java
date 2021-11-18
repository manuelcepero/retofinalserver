/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nttdata.retofinalserver.service;

import com.nttdata.retofinalserver.usuario.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Manuel
 */
public class UsuarioService {
    
    List<Usuario> listaUsuarios;

    public UsuarioService() {
        
        listaUsuarios = new ArrayList<>();
    }
    
    public void anadirUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }
    
    public void eliminarUsuario(int id){
        Usuario usuarioObtenido = listaUsuarios.stream().filter(user -> user.getId() == id).findFirst().get();
        listaUsuarios.remove(usuarioObtenido.getId());
    }

    public List<Usuario> obtenerTodosUsuarios(){
        return listaUsuarios;
    }
        
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
    
    
}
