package com.mateus.crudBackend1.services;

import com.mateus.crudBackend1.models.Cartao;
import com.mateus.crudBackend1.repository.CartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartaoService {

    private final CartaoRepository cartaoRepository;

    public Cartao salvar(Cartao cartao) {
        return cartaoRepository.save(cartao);
    }

    public Cartao buscarPorId(int id) {
        return cartaoRepository.findById(id).orElse(null);
    }

    public Iterable<Cartao> listarTodos() {
        return cartaoRepository.findAll();
    }

    public void deletar(int id) {
        cartaoRepository.deleteById(id);
    }
}
