package com.exemplo.usuarioapi.controller;

import com.exemplo.usuarioapi.dto.UsuarioResponseDTO;
import com.exemplo.usuarioapi.entity.Usuario;
import com.exemplo.usuarioapi.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public UsuarioResponseDTO criar(@RequestBody @Valid Usuario usuario) {
        Usuario usuarioSalvo = service.salvar(usuario);

        return new UsuarioResponseDTO(
                usuarioSalvo.getId(),
                usuarioSalvo.getNome(),
                usuarioSalvo.getEmail()
        );
    }

    @GetMapping
    public List<UsuarioResponseDTO> listar() {
        return service.listarTodos()
                .stream()
                .map(usuario -> new UsuarioResponseDTO(
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getEmail()
                ))
                .toList();
    }

    @GetMapping("/{id}")
    public UsuarioResponseDTO buscarPorId(@PathVariable Long id) {
        Usuario usuario = service.buscarPorId(id);

        return new UsuarioResponseDTO(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail()
        );
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}














