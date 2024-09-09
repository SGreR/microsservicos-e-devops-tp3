package com.infnet.fornecedorservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "FORNECEDORES")
public class Fornecedor {
    @Id
    private Long id;
    private String nome;
    private String cnpj;
    private String endereco;
}
