package com.itb.tcc.inf2cm.myproject2c.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.tcc.inf2cm.myproject2c.model.PessoaFisica;


@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {

}
