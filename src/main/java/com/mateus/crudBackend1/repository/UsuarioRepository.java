package com.mateus.crudBackend1.repository;

import com.mateus.crudBackend1.models.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
