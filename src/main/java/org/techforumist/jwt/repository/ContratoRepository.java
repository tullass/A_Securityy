package org.techforumist.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Contrato;

@Repository
public interface ContratoRepository extends CrudRepository<Contrato, Long> {

}

