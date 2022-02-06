package com.sigabem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigabem.model.SigaBemModel;

@Repository
public interface SigaBemRepository extends JpaRepository<SigaBemModel, Long>{

}
