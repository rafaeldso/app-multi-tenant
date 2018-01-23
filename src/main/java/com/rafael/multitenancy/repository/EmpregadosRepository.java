package com.rafael.multitenancy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.multitenancy.model.Empregado;

public interface EmpregadosRepository extends JpaRepository<Empregado, Long>{

}
