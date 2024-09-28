package com.mateus.crudBackend1.services;

import com.mateus.crudBackend1.Dto.UsuarioDto;
import com.mateus.crudBackend1.models.Usuario;
import com.mateus.crudBackend1.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public List<Usuario> getAllUsuarios(){
        return repository.findAll();
    }

    public UsuarioDto postUsuario(Usuario usuario){
        return new UsuarioDto(repository.save(usuario));
    }

    public Usuario getUsuarioById(int id){
        Optional<Usuario> usuarioOptional = repository.findById(id);
        return usuarioOptional.orElse(null);
    }

    public UsuarioDto updateUsuario(int id, Usuario usuarioAtualizado){
        Optional<Usuario> usuarioOptional = repository.findById(id);
        if (usuarioOptional.isPresent()){
            Usuario usuario = usuarioOptional.get();
            usuario.setCpf(usuarioAtualizado.getCpf());
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setEmail(usuarioAtualizado.getEmail());
            usuario.setIdade(usuarioAtualizado.getIdade());

            return new UsuarioDto(repository.save(usuario));
        } else {
            throw new NoSuchElementException();
        }
    }

    public UsuarioDto deleteUsuario(int id) {
        Optional<Usuario> usuarioOptional = repository.findById(id);
        repository.deleteById(id);
        if (usuarioOptional.isPresent()) {
            return new UsuarioDto(usuarioOptional.get());
        } else {
            throw new NoSuchElementException();
        }
    }
}
