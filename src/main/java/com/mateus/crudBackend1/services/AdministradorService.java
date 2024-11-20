package com.mateus.crudBackend1.services;

import com.mateus.crudBackend1.models.Administrador;
import com.mateus.crudBackend1.repository.AdministradorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdministradorService {

    private final AdministradorRepository administradorRepository;

    public Administrador salvar(Administrador administrador) {
        return administradorRepository.save(administrador);
    }

    public Administrador buscarPorMatricula(String matricula) {
        return administradorRepository.findById(matricula).orElse(null);
    }

    public Iterable<Administrador> listarTodos() {
        return administradorRepository.findAll();
    }

    public void deletar(String matricula) {
        administradorRepository.deleteById(matricula);
    }
}
