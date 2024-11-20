package com.mateus.crudBackend1.repository;

import com.mateus.crudBackend1.models.Conta;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends CrudRepository<Conta, String> {
}
