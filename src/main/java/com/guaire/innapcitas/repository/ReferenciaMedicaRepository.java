package com.guaire.innapcitas.repository;

import com.guaire.innapcitas.domain.ReferenciaMedica;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ReferenciaMedica entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ReferenciaMedicaRepository extends JpaRepository<ReferenciaMedica, Long> {

}
