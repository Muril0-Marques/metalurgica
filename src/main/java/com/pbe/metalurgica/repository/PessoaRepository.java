package com.pbe.metalurgica.repository;

import com.pbe.metalurgica.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}