package com.sigabem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigabem.model.SigaBemModel;

/**
 * Interface que define o repositório para operações relacionadas ao modelo SigaBem no projeto.
 *
 * Esta interface estende JpaRepository, fornecendo métodos de acesso a dados predefinidos para SigaBemModel.
 *
 * @see org.springframework.data.jpa.repository.JpaRepository
 */
@Repository
public interface SigaBemRepository extends JpaRepository<SigaBemModel, Long>{

}
