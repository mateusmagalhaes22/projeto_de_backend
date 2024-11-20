package com.mateus.crudBackend1.controllers;
import com.mateus.crudBackend1.models.Cartao;
import com.mateus.crudBackend1.services.CartaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartoes")
@RequiredArgsConstructor
public class CartaoController {

    private final CartaoService cartaoService;

    @PostMapping
    public ResponseEntity<Cartao> criarCartao(@RequestBody Cartao cartao) {
        return new ResponseEntity<>(cartaoService.salvar(cartao), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cartao> buscarPorId(@PathVariable int id) {
        return new ResponseEntity<>(cartaoService.buscarPorId(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Iterable<Cartao>> listarTodos() {
        return new ResponseEntity<>(cartaoService.listarTodos(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id) {
        cartaoService.deletar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}