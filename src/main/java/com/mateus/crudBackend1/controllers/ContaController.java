package com.mateus.crudBackend1.controllers;
import com.mateus.crudBackend1.models.Conta;
import com.mateus.crudBackend1.services.ContaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contas")
@RequiredArgsConstructor
public class ContaController {

    private final ContaService contaService;

    @PostMapping
    public ResponseEntity<Conta> criarConta(@RequestBody Conta conta) {
        return new ResponseEntity<>(contaService.salvar(conta), HttpStatus.CREATED);
    }

    @GetMapping("/{numero}")
    public ResponseEntity<Conta> buscarPorId(@PathVariable String numero) {
        return new ResponseEntity<>(contaService.buscarPorNumero(numero), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Iterable<Conta>> listarTodos() {
        return new ResponseEntity<>(contaService.listarTodos(), HttpStatus.OK);
    }

    @DeleteMapping("/{numero}")
    public ResponseEntity<Void> deletar(@PathVariable String numero) {
        contaService.deletar(numero);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}