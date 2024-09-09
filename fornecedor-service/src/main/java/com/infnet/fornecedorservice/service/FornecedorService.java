package com.infnet.fornecedorservice.service;

import com.infnet.fornecedorservice.model.Fornecedor;
import com.infnet.fornecedorservice.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    private final FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public Iterable<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> findById(Long id) {
        return fornecedorRepository.findById(id);
    }

    public Fornecedor save(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor update(Long id, Fornecedor fornecedor) {
        fornecedor.setId(id);
        return fornecedorRepository.save(fornecedor);
    }

    public void delete(Long id) {
        fornecedorRepository.deleteById(id);
    }


}
