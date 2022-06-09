package com.grupo7.aulajava.util;

import com.grupo7.aulajava.model.Casa;
import com.grupo7.aulajava.model.Usuario;
import com.grupo7.aulajava.repository.CasaRepository;
import com.grupo7.aulajava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Seeding implements ApplicationRunner {
    private UsuarioRepository usuarioRepository;
    private CasaRepository casaRepository;

    @Autowired
    public Seeding(UsuarioRepository usuarioRepository, CasaRepository casaRepository) {
        this.usuarioRepository = usuarioRepository;
        this.casaRepository = casaRepository;
    }

    public void run (ApplicationArguments args) {
        Usuario usuario1 = new Usuario();
        usuario1.setNome("Marlusi");
        usuario1.setSobrenome("Brito");
        usuario1.setIdade(26);

        Casa casa1 = new Casa();
        casa1.setNome("Minha casinha");
        casa1.setEndereco("Rua Brigadeiro");

        usuario1.setCasa(casa1);
        casa1.setUsuario(usuario1);
        usuarioRepository.save(usuario1);
        casaRepository.save(casa1);




    }
}
