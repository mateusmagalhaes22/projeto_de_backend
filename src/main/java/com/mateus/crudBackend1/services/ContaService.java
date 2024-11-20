package com.mateus.crudBackend1.services;

import com.mateus.crudBackend1.models.Conta;
import com.mateus.crudBackend1.repository.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContaService {

    private final ContaRepository contaRepository;

    public Conta salvar(Conta conta) {
        return contaRepository.save(conta);
    }

    public Conta buscarPorNumero(String numero) {
        return contaRepository.findById(numero).orElse(null);
    }

    public Iterable<Conta> listarTodos() {
        return contaRepository.findAll();
    }

    public void deletar(String numero) {
        contaRepository.deleteById(numero);
    }
}
