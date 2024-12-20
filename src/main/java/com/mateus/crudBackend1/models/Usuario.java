package com.mateus.crudBackend1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Usuario {
    @Id
    private int id;
    private String name;
    private String email;
    @OneToMany
    private List<Cartao> cartoes;
}
