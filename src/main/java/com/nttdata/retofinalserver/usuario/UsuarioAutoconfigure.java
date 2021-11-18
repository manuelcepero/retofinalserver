/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nttdata.retofinalserver.usuario;

import com.nttdata.retofinalserver.service.UsuarioService;
import org.bouncycastle.asn1.x509.sigi.PersonalData;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Manuel
 */
@Configuration
@EnableConfigurationProperties
@ConditionalOnClass({Usuario.class, UsuarioService.class, UsuarioBuilder.class})
public class UsuarioAutoconfigure {

    @Bean
    public UsuarioBuilder usuarioBuilder(){
        return new UsuarioBuilder();
    }

    @Bean
    public UsuarioService personaService(){
        return new UsuarioService();
    }
    
}
