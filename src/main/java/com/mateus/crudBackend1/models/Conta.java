package com.mateus.crudBackend1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Conta {
    @Id
    private String numero;
    @ManyToOne
    @JoinColumn(name = "idTitular")
    private Usuario titular;
    private double saldo;
    private double fatura;
}
