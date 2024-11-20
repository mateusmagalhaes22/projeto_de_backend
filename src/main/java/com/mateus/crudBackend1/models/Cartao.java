package com.mateus.crudBackend1.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Cartao {

    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario idUsuario;
    private String numero;
    private String validade;
    private String cvv;
    private double limite;
    private double fatura;
}
