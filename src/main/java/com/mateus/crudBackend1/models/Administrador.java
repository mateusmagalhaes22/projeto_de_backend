package com.mateus.crudBackend1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Administrador {
    @Id
    private String matricula;
    private String nome;
    private String email;
    private boolean ativo;
}
