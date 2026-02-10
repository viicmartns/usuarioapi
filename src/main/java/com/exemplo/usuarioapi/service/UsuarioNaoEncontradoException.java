package com.exemplo.usuarioapi.service;

public class UsuarioNaoEncontradoException extends RuntimeException {

    public UsuarioNaoEncontradoException(Long id) {
        super("Usuário com id " + id + " não encontrado");
    }
}


