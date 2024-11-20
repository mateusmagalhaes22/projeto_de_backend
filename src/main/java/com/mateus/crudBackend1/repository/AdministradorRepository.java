package com.mateus.crudBackend1.repository;

import com.mateus.crudBackend1.models.Administrador;
import com.mateus.crudBackend1.models.Cartao;
import org.springframework.data.repository.CrudRepository;

public interface AdministradorRepository extends CrudRepository<Administrador, String> {

}
