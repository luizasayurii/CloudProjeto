package br.com.cidadao.backend.repository;

import br.com.cidadao.backend.model.Problema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemaRepository extends JpaRepository<Problema, Long> {
}
