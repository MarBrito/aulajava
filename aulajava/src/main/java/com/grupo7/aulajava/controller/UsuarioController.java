package com.grupo7.aulajava.controller;

import com.grupo7.aulajava.model.Usuario;
import com.grupo7.aulajava.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarTodosOsUsuarios() {
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }
}
