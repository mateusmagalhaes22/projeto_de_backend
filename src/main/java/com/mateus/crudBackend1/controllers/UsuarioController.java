package com.mateus.crudBackend1.controllers;


import com.mateus.crudBackend1.Dto.UsuarioDto;
import com.mateus.crudBackend1.models.Usuario;
import com.mateus.crudBackend1.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    @GetMapping()
    public ResponseEntity<List<Usuario>> getAllUsuarios(){
        return new ResponseEntity<>(service.getAllUsuarios(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable int id){
        return new ResponseEntity<>(service.getUsuarioById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<UsuarioDto> postUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<>(service.postUsuario(usuario), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<UsuarioDto> deleteUsuario(@PathVariable int id){
        return new ResponseEntity<>(service.deleteUsuario(id), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<UsuarioDto> updateUsuario(@PathVariable int id, @RequestBody Usuario usuario){
        return new ResponseEntity<>(service.updateUsuario(id, usuario), HttpStatus.ACCEPTED);
    }

}
