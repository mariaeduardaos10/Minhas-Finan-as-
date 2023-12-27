package com.mesantos.minhasfinancas.model.repository;


import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import com.mesantos.minhasfinancas.model.entity.Usuario;


@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@DataJpaTest
public class UsuarioRepositoryTest {
	
	
		@Autowired
		UsuarioRepository repository;
	
		@Test
		public void deveVerificarAExistenciaDeUmEmail() {
			
		
			Usuario usuario = Usuario.builder().nome("usuario").email("usuario@email.com").build();	
			repository.save(usuario);

			boolean result = repository.existsByEmail("usuario@email.com");
			
			Assertions.assertThat(result).isTrue();
		}
}
