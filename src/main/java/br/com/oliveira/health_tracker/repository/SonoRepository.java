package br.com.oliveira.health_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oliveira.health_tracker.entity.Sono;

public interface SonoRepository extends JpaRepository<Sono, Long> {
    
}