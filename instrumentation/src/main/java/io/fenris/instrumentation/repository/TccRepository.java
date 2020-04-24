package io.fenris.instrumentation.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.fenris.instrumentation.model.TccModel;

@Repository
@Transactional
public interface TccRepository extends JpaRepository<TccModel, Integer> {

}
