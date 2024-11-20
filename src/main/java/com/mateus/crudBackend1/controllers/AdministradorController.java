package com.mateus.crudBackend1.controllers;
import com.mateus.crudBackend1.models.Administrador;
import com.mateus.crudBackend1.services.AdministradorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administradores")
@RequiredArgsConstructor
public class AdministradorController {

    private final AdministradorService administradorService;

    @PostMapping
    public ResponseEntity<Administrador> criarAdministrador(@RequestBody Administrador administrador) {
        return new ResponseEntity<>(administradorService.salvar(administrador), HttpStatus.CREATED);
    }

    @GetMapping("/{matricula}")
    public ResponseEntity<Administrador> buscarPorId(@PathVariable String matricula) {
        return new ResponseEntity<>(administradorService.buscarPorMatricula(matricula), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Iterable<Administrador>> listarTodos() {
        return new ResponseEntity<>(administradorService.listarTodos(), HttpStatus.OK);
    }

    @DeleteMapping("/{matricula}")
    public ResponseEntity<Void> deletar(@PathVariable String matricula) {
        administradorService.deletar(matricula);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}