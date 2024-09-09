package com.infnet.fornecedorservice.repository;

import com.infnet.fornecedorservice.model.Fornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Long> {
}
