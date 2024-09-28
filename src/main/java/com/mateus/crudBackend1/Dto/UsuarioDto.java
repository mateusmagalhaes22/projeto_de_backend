package com.mateus.crudBackend1.Dto;

import com.mateus.crudBackend1.models.Usuario;
import lombok.Data;

@Data
public class UsuarioDto {

    private String nome;
    private String email;

    public UsuarioDto(Usuario usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }

}
