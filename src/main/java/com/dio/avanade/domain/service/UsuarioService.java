package com.dio.avanade.domain.service;

import com.dio.avanade.domain.model.Usuario;

public interface UsuarioService {

    Usuario findById(Long id);

    Usuario create(Usuario usuario);
}
