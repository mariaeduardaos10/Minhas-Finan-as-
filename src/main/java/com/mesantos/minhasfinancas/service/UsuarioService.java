package com.mesantos.minhasfinancas.service;

import com.mesantos.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email); 
	
	
	
}
